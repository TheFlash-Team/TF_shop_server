package com.yc.shop_server.service;

import com.yc.shop_server.entity.User;

import java.util.List;

public interface UserService {

    User findUser(String userId);

    List<User> getUserList();

    Integer addUser(User user);

    User findByUserName(String userName);
}
