package com.yc.shop_server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yc.shop_server.entity.FundFlow;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FundFlowMapper extends BaseMapper<FundFlow> {
    List<FundFlow> selectList();
}
