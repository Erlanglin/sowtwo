package org.myoranges.sotwo.wx.web;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.bean.WxMaJscode2SessionResult;
import me.chanjar.weixin.common.exception.WxErrorException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.myoranges.sotwo.core.util.JacksonUtil;
import org.myoranges.sotwo.core.util.ResponseUtil;
import org.myoranges.sotwo.core.util.bcrypt.BCryptPasswordEncoder;
import org.myoranges.sotwo.db.domain.SotwoUser;
import org.myoranges.sotwo.db.service.SotwoUserService;
import org.myoranges.sotwo.wx.dao.FullUserInfo;
import org.myoranges.sotwo.wx.dao.UserInfo;
import org.myoranges.sotwo.wx.dao.UserToken;
import org.myoranges.sotwo.wx.service.UserTokenManager;
import org.myoranges.sotwo.wx.util.IpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/wx/auth")
public class WxAuthController {
    private final Log logger = LogFactory.getLog(WxAuthController.class);

    @Autowired
    private SotwoUserService userService;

    @Autowired
    private WxMaService wxService;

    /**
     * 账号登录
     *
     * @param body 请求内容，{ username: xxx, password: xxx }
     * @param request 请求对象
     * @return 登录结果
     *   成功则
     *  {
     *      errno: 0,
     *      errmsg: '成功',
     *      data:
     *          {
     *              token: xxx,
     *              tokenExpire: xxx,
     *              userInfo: xxx
     *          }
     *  }
     *   失败则 { errno: XXX, errmsg: XXX }
     */
    @RequestMapping("login")
    public Object login(@RequestBody String body, HttpServletRequest request) {
        String username = JacksonUtil.parseString(body, "username");
        String password = JacksonUtil.parseString(body, "password");
        if(username == null || password == null){
            return ResponseUtil.badArgument();
        }

        List<SotwoUser> userList =userService.queryByUsername(username);
        SotwoUser user = null;
        if(userList.size() > 1){
            return ResponseUtil.fail502();
        }
        else if(userList.size() == 0){
            return ResponseUtil.badArgumentValue();
        }
        else {
            user = userList.get(0);
        }

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        if(!encoder.matches(password, user.getPassword())){
            return ResponseUtil.fail(403, "账号密码不对");
        }

        // userInfo
        UserInfo userInfo = new UserInfo();
        userInfo.setNickName(username);
        userInfo.setAvatarUrl(user.getAvatar());

        // token
        UserToken userToken = UserTokenManager.generateToken(user.getId());

        Map<Object, Object> result = new HashMap<Object, Object>();
        result.put("token", userToken.getToken());
        result.put("tokenExpire", userToken.getExpireTime().toString());
        result.put("userInfo", userInfo);
        return ResponseUtil.ok(result);
    }

    /**
     * 微信登录
     *
     * @param body 请求内容，{ code: xxx, userInfo: xxx }
     * @param request 请求对象
     * @return 登录结果
     *   成功则
     *  {
     *      errno: 0,
     *      errmsg: '成功',
     *      data:
     *          {
     *              token: xxx,
     *              tokenExpire: xxx,
     *              userInfo: xxx
     *          }
     *  }
     *   失败则 { errno: XXX, errmsg: XXX }
     */
    @RequestMapping("login_by_weixin")
    public Object loginByWeixin(@RequestBody String body, HttpServletRequest request) {
        String code = JacksonUtil.parseString(body, "code");
        FullUserInfo fullUserInfo = JacksonUtil.parseObject(body, "userInfo", FullUserInfo.class);
        if(code == null || fullUserInfo == null){
            return ResponseUtil.badArgument();
        }

        UserInfo userInfo = fullUserInfo.getUserInfo();

        String sessionKey = null;
        String openId = null;
        try {
            WxMaJscode2SessionResult result = this.wxService.getUserService().getSessionInfo(code);
            sessionKey = result.getSessionKey();
            openId = result.getOpenid();
        } catch (WxErrorException e) {
            e.printStackTrace();
        }

        if(sessionKey == null || openId == null){
            return ResponseUtil.fail();
        }

        //验证用户信息完整性
        if (!this.wxService.getUserService().checkUserInfo(sessionKey, fullUserInfo.getRawData(), fullUserInfo.getSignature())) {
            return ResponseUtil.fail();
        }

        // 解密用户信息
//        WxMaUserInfo wxMaUserInfo = this.wxService.getUserService().getUserInfo(sessionKey, fullUserInfo.getEncryptedData(), fullUserInfo.getIv());

        SotwoUser user = userService.queryByOid(openId);
        if(user == null){
            user = new SotwoUser();
            user.setUsername(userInfo.getNickName());  // 其实没有用，因为用户没有真正注册
            user.setPassword(openId);                  // 其实没有用，因为用户没有真正注册
            user.setWeixinOpenid(openId);
            user.setAvatar(userInfo.getAvatarUrl());
            user.setNickname(userInfo.getNickName());
            user.setGender(userInfo.getGender() == 1 ? "男" : "女");
            user.setUserLevel("普通用户");
            user.setStatus("可用");
            user.setLastLoginTime(LocalDateTime.now());
            user.setLastLoginIp(IpUtil.client(request));
            userService.add(user);
        }
        else{
            user.setLastLoginTime(LocalDateTime.now());
            user.setLastLoginIp(IpUtil.client(request));
            userService.update(user);
        }

        // token
        UserToken userToken = UserTokenManager.generateToken(user.getId());

        Map<Object, Object> result = new HashMap<Object, Object>();
        result.put("token", userToken.getToken());
        result.put("tokenExpire", userToken.getExpireTime().toString());
        result.put("userInfo", userInfo);
        return ResponseUtil.ok(result);
    }

    /**
     * 账号注册
     *
     * @param body 请求内容
     *  {
     *      username: xxx,
     *      password: xxx,
     *      mobile: xxx
     *      code: xxx
     *  }
     *  其中code是手机验证码，目前还不支持手机短信验证码
     * @param request 请求对象
     * @return 登录结果
     *   成功则
     *  {
     *      errno: 0,
     *      errmsg: '成功',
     *      data:
     *          {
     *              token: xxx,
     *              tokenExpire: xxx,
     *              userInfo: xxx
     *          }
     *  }
     *   失败则 { errno: XXX, errmsg: XXX }
     */
    @PostMapping("register")
    public Object register(@RequestBody String body, HttpServletRequest request) {
        String username = JacksonUtil.parseString(body, "username");
        String password = JacksonUtil.parseString(body, "password");
        String mobile = JacksonUtil.parseString(body, "mobile");
        String code = JacksonUtil.parseString(body, "code");

        if(username == null || password == null || mobile == null || code == null){
            return ResponseUtil.badArgument();
        }

        List<SotwoUser> userList = userService.queryByUsername(username);
        if(userList.size() > 0){
            return ResponseUtil.fail(403, "用户名已注册");
        }

        userList = userService.queryByMobile(mobile);
        if(userList.size() > 0){
            return ResponseUtil.fail(403, "手机号已注册");
        }
        SotwoUser user = new SotwoUser();

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encodedPassword = encoder.encode(password);
        user.setPassword(encodedPassword);

        user = new SotwoUser();
        user.setUsername(username);
        user.setPassword(encodedPassword);
        user.setMobile(mobile);
        user.setWeixinOpenid("");
        user.setAvatar("https://yanxuan.nosdn.127.net/80841d741d7fa3073e0ae27bf487339f.jpg?imageView&quality=90&thumbnail=64x64");
        user.setNickname(username);
        user.setGender("未知");
        user.setUserLevel("普通用户");
        user.setStatus("可用");
        user.setLastLoginTime(LocalDateTime.now());
        user.setLastLoginIp(IpUtil.client(request));
        userService.add(user);


        // userInfo
        UserInfo userInfo = new UserInfo();
        userInfo.setNickName(username);
        userInfo.setAvatarUrl(user.getAvatar());

        // token
        UserToken userToken = UserTokenManager.generateToken(user.getId());

        Map<Object, Object> result = new HashMap<Object, Object>();
        result.put("token", userToken.getToken());
        result.put("tokenExpire", userToken.getExpireTime().toString());
        result.put("userInfo", userInfo);
        return ResponseUtil.ok(result);
    }

    /**
     * 账号密码重置
     *
     * @param body 请求内容
     *  {
     *      password: xxx,
     *      mobile: xxx
     *      code: xxx
     *  }
     *  其中code是手机验证码，目前还不支持手机短信验证码
     * @param request 请求对象
     * @return 登录结果
     *   成功则 { errno: 0, errmsg: '成功' }
     *   失败则 { errno: XXX, errmsg: XXX }
     */
    @PostMapping("reset")
    public Object reset(@RequestBody String body, HttpServletRequest request) {
        String password = JacksonUtil.parseString(body, "password");
        String mobile = JacksonUtil.parseString(body, "mobile");
        String code = JacksonUtil.parseString(body, "code");

        if(mobile == null || code == null || password == null){
            return ResponseUtil.badArgument();
        }

        List<SotwoUser> userList = userService.queryByMobile(mobile);
        SotwoUser user = null;
        if(userList.size() > 1){
            return ResponseUtil.serious();
        }
        else if(userList.size() == 0){
            return ResponseUtil.fail(403, "手机号未注册");
        }
        else{
            user = userList.get(0);
        }

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encodedPassword = encoder.encode(password);
        user.setPassword(encodedPassword);

        userService.update(user);

        return ResponseUtil.ok();
    }
}
