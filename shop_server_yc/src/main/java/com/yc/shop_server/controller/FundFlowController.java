package com.yc.shop_server.controller;

import com.yc.shop_server.entity.FundFlow;
import com.yc.shop_server.service.FundFlowService;
import org.apache.tomcat.jni.Mmap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/fundFlow")
public class FundFlowController {


    @Autowired
    FundFlowService flowService;

    /**
     * 查询列表
     */
    @RequestMapping("/findAll")
    public String findALl(ModelMap map){
        List<FundFlow> all = flowService.findAll();
        map.put("list", all);
        return "/fundFlow/list";
    }

    /**
     * 添加一行记录
     */
    @RequestMapping("/add")
    public String add(FundFlow flow){
        flow.setCreatTime(new Date());
        int add = flowService.add(flow);

        return "/fundFlow/list";
    }
}
