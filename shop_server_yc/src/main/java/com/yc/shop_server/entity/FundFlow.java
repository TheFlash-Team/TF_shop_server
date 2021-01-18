package com.yc.shop_server.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

@Data
public class FundFlow {

    @TableId(type = IdType.ASSIGN_ID)
    private String id;

    private Date creatTime;

    private Double money;

    private String remark;

    private String moneyType;
}
