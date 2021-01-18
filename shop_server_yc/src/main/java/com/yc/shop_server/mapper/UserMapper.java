package com.yc.shop_server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yc.shop_server.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper extends BaseMapper<User> {

    /**
     * 查询用户列表
     * @return
     */
    List<User> selectList();

    /**
     * 根据用户名查询
     */
    User findByUserName(String userName);
}
