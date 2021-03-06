package org.myoranges.sotwo.wx.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.myoranges.sotwo.core.util.ResponseUtil;
import org.myoranges.sotwo.db.domain.SotwoRegion;
import org.myoranges.sotwo.db.service.SotwoRegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/wx/region")
public class WxRegionController {
    private final Log logger = LogFactory.getLog(WxRegionController.class);

    @Autowired
    private SotwoRegionService regionService;

    /**
     * 区域数据
     *
     * 根据父区域ID，返回子区域数据。
     * 如果父区域ID是0，则返回省级区域数据；
     *
     * @param pid 父区域ID
     * @return 区域数据
     *   成功则
     *  {
     *      errno: 0,
     *      errmsg: '成功',
     *      data: xxx
     *  }
     *   失败则 { errno: XXX, errmsg: XXX }
     */
    @GetMapping("list")
    public Object list(Integer pid) {
        if(pid == null){
            return ResponseUtil.badArgument();
        }

        List<SotwoRegion> regionList = regionService.queryByPid(pid);
        return ResponseUtil.ok(regionList);
    }


}