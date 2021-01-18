package com.yc.shop_server.service.impl;


import com.yc.shop_server.entity.User;
import com.yc.shop_server.mapper.UserMapper;
import com.yc.shop_server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    public User findUser(String userId){
        User user = userMapper.selectById(userId);
        return user;
    }

    public List<User> getUserList(){
        List<User> users = userMapper.selectList();
        return users;
    }

    /**
     * 添加用户
     * @param user
     * @return
     */
    @Override
    public Integer addUser(User user) {
        int flat = userMapper.insert(user);
        return flat;
    }

    /**
     * 根据用户名查询
     * @param userName
     * @return
     */
    public User findByUserName(String userName){
        User user = userMapper.findByUserName(userName);
        return user;
    }

}
