package com.yc.shop_server.service;

import com.yc.shop_server.entity.FundFlow;

import java.util.List;

public interface FundFlowService {

    List<FundFlow> findAll();

    int add(FundFlow fundFlow);
}
