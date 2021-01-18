package com.yc.shop_server.config;

import com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 自定义ID生成器
 */
@Slf4j
//@Component
public class IdGenerator implements IdentifierGenerator {

    private final AtomicLong aLong = new AtomicLong(1);

    @Override
    public Long nextId(Object entity){
        //将传入的class全类名作为bizKey或者提取参数生成bizKey进行分布式ID调用生成
        String bizKey = entity.getClass().getName();
        log.info("bizKey:{}",bizKey);
        MetaObject metaObject = SystemMetaObject.forObject(entity);
        String name = (String)metaObject.getValue("userName");
        final long id = aLong.getAndAdd(1);
        log.info("为{}生成主键值->:{}",name,id);
        return id;
    }

//    @Override
//    public String nextUUID(Object entity){
//        //将传入的class全类名作为bizKey或者提取参数生成bizKey进行分布式ID调用生成
//        String bizKey = entity.getClass().getName();
//        log.info("bizKey:{}",bizKey);
//        String
//        log.info("为{}生成主键值->:{}",name,id);
//        return id;
//    }
}
