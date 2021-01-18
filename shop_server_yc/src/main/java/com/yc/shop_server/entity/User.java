package com.yc.shop_server.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class User {

    @TableId(type = IdType.ASSIGN_ID)
    private String id;

    private String userName;

    private String sex;

    private String passWord;
}
