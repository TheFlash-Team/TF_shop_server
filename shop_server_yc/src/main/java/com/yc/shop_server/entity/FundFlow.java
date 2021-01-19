package com.yc.shop_server.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class FundFlow {

    @TableId(type = IdType.ASSIGN_ID)
    private String id;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date creatTime;

    private Double money;

    private String remark;

    private String moneyType;

    private String userName;
}
