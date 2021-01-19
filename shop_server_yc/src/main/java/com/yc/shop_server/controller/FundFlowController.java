package com.yc.shop_server.controller;

import com.yc.shop_server.entity.FundFlow;
import com.yc.shop_server.service.FundFlowService;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.jni.Mmap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

@Slf4j
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
        for (FundFlow fundFlow :all){
            fundFlow.setMoneyType(fundFlow.getMoneyType().equals("0") ? "支出" : "收入");
        }
        map.put("list", all);
        return "/fundFlow/list";
    }
    /**
     * 查询列表
     */
    @RequestMapping("/toAdd")
    public String toAdd(){
        return "/fundFlow/add";
    }
    /**
     * 添加一行记录
     */
    @RequestMapping("/add")
    public void add(FundFlow flow){
        System.out.println(new Date());
        flow.setCreatTime(new Date());
        int add = flowService.add(flow);
        if(add!=1){
            log.info("{}添加失败",flow.getRemark());
        }else {
            log.info("{}添加成功",flow.getRemark());
        }

    }
}
