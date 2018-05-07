package org.myoranges.sotwo.wx.web;


import org.myoranges.sotwo.core.util.JacksonUtil;
import org.myoranges.sotwo.core.util.ResponseUtil;
import org.myoranges.sotwo.db.domain.SotwoFootprint;
import org.myoranges.sotwo.db.domain.SotwoGoods;
import org.myoranges.sotwo.db.service.SotwoFootprintService;
import org.myoranges.sotwo.db.service.SotwoGoodsService;
import org.myoranges.sotwo.wx.annotation.LoginUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/wx/footprint")
public class WxFootprintController {
    @Autowired
    private SotwoFootprintService footprintService;
    @Autowired
    private SotwoGoodsService goodsService;

    /**
     * 删除用户足迹
     *
     * @param userId 用户ID
     * @param body 请求内容， { footprintId: xxx }
     * @return 删除操作结果
     *   成功则 { errno: 0, errmsg: '成功' }
     *   失败则 { errno: XXX, errmsg: XXX }
     */
    @PostMapping("delete")
    public Object delete(@LoginUser Integer userId, @RequestBody String body) {
        if(userId == null){
            return ResponseUtil.unlogin();
        }
        if(body == null){
            return ResponseUtil.badArgument();
        }

        Integer footprintId = JacksonUtil.parseInteger(body, "footprintId");
        if(footprintId == null){
            return ResponseUtil.badArgument();
        }
        SotwoFootprint footprint = footprintService.findById(footprintId);

        if(footprint == null){
            return ResponseUtil.badArgumentValue();
        }
        if(!footprint.getUserId().equals(userId)){
            return ResponseUtil.badArgumentValue();
        }

        footprintService.deleteById(footprintId);
        return ResponseUtil.ok();
    }

    /**
     * 用户足迹列表
     *
     * @param page 分页页数
     * @param size 分页大小
     * @return 用户足迹列表
     *   成功则
     *  {
     *      errno: 0,
     *      errmsg: '成功',
     *      data:
     *          {
     *              footprintList: xxx,
     *              totalPages: xxx
     *          }
     *  }
     *   失败则 { errno: XXX, errmsg: XXX }
     */
    @GetMapping("list")
    public Object list(@LoginUser Integer userId,
                       @RequestParam(value = "page", defaultValue = "1") Integer page,
                       @RequestParam(value = "size", defaultValue = "10") Integer size) {
        if(userId == null){
            return ResponseUtil.unlogin();
        }

        List<SotwoFootprint> footprintList = footprintService.queryByAddTime(userId, page, size);
        int count = footprintService.countByAddTime(userId, page, size);
        int totalPages = (int) Math.ceil((double) count / size);

        List<Object> footprintVoList = new ArrayList<>(footprintList.size());
        for(SotwoFootprint footprint : footprintList){
            Map<String, Object> c = new HashMap();
            c.put("id", footprint.getId());
            c.put("goodsId", footprint.getGoodsId());
            c.put("addTime", footprint.getAddTime());

            SotwoGoods goods = goodsService.findById(footprint.getGoodsId());
            c.put("name", goods.getName());
            c.put("goodsBrief", goods.getGoodsBrief());
            c.put("listPicUrl", goods.getListPicUrl());
            c.put("retailPrice", goods.getRetailPrice());

            footprintVoList.add(c);
        }


        Map<String, Object> result = new HashMap<>();
        result.put("footprintList", footprintVoList);
        result.put("totalPages", totalPages);
        return ResponseUtil.ok(result);
    }

}