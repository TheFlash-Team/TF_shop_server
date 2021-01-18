package com.yc.shop_server.service.impl;

import com.yc.shop_server.entity.FundFlow;
import com.yc.shop_server.mapper.FundFlowMapper;
import com.yc.shop_server.service.FundFlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FundFlowServiceImpl implements FundFlowService {

    @Autowired
    FundFlowMapper mapper;


    /**
     * 查询列表
     * @return
     */
    public List<FundFlow> findAll(){
        List<FundFlow> list = mapper.selectList();
        return list;
    }

    /**
     * 添加记录
     * @return
     */
    public int add(FundFlow fundFlow){
        int insert = mapper.insert(fundFlow);
        return insert;
    }
}
