package com.yc.shop_server;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class DataUtil {

    /**
     * 获取当天的日期
     */
    @Test
    public void fun1(){
        LocalDate now = LocalDate.now();
        System.out.println("今天的日期："+now);
        System.out.println("年："+now.getYear());
        System.out.println("月："+now.getMonth());
        System.out.println("日："+now.getDayOfMonth());
    }

    /**
     * 创建任意日期
     */
    @Test
    public void fun2(){
        LocalDate now = LocalDate.of(2008,1,3);
        System.out.println(now);
    }

    /**
     * 判断日期是否相等
     */
    @Test
    public void fun3(){
        LocalDate now = LocalDate.of(2008,1,3);
        LocalDate now1 = LocalDate.now();
        if (now.equals(now1)){
            System.out.println("相等");
        }else {
            System.out.println("不相等");
        }
    }
}
