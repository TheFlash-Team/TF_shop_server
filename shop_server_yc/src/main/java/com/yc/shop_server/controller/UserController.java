package com.yc.shop_server.controller;

import com.sun.org.apache.regexp.internal.RE;
import com.yc.shop_server.config.MD5Utile;
import com.yc.shop_server.entity.User;
import com.yc.shop_server.service.UserService;
import org.apache.catalina.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    /**
     * 查询用户列表
     */
    @RequestMapping("/getUserList")
    public void getUserList() {
        List<User> userList = userService.getUserList();
        System.out.println(userList.size());
    }


    /**
     * 添加用户
     */
    @RequestMapping("/addUser")
    public void addUser(User user) {
        user.setPassWord(MD5Utile.code(user.getPassWord()));
        Integer integer = userService.addUser(user);
        if (integer.equals(1)) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }

    /**
     * 登录
     */
    @RequestMapping("/login")
    public String login(HttpServletRequest request, String userName, String passWord) {
        //用户是否存在
        User user = userService.findByUserName(userName);
        if (user != null) {
            String code = MD5Utile.code(passWord);
            if (code.equals(user.getPassWord())) {
                System.out.println("登录成功！");
                //保存session
                HttpSession session = request.getSession();
                session.setMaxInactiveInterval(10);
                session.setAttribute("UserSession", user);
            }
        } else {
            System.out.println("用户不存在！");
        }
        return "/login/login";
    }

    /**
     * 查看session
     */
    @RequestMapping("/getSession")
    public User login(HttpServletRequest request) {

        User userSession = (User) request.getSession().getAttribute("UserSession");
        if (userSession!=null){
            return userSession;
        }else {
            return new User();
        }
    }
}
