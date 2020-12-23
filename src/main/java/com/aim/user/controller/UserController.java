package com.aim.user.controller;

import com.aim.entity.User;
import com.aim.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/userController")
public class UserController {
    @Autowired
    private UserService userService;


    @RequestMapping("/register")
    @ResponseBody
    public String register(User user){
        System.out.println("访问了register controller！！");
        System.out.println("参数:" + user);
        int flag = userService.addUser(user);
        if(flag != 0){
            System.out.println("添加user成功");
            String jsonResult = "{\"reasonCode\":\"00\", \"reasonContext\":\"注册成功!\"}";
            return jsonResult;
        }else{
            System.out.println("添加失败！");
            return null;
        }
    }


    @RequestMapping("/login")
    @ResponseBody
    public String login(String userName, String userPassword, HttpSession session){
        System.out.println("访问了login controller！！");
        System.out.println("参数:" + userName + " / " + userPassword);
        User userInfo = userService.login(userName, userPassword);
        if(userInfo != null){
            System.out.println("查询到该用户，可以登录");
            session.setAttribute("userInfo",userInfo);
            String jsonResult = "{\"reasonCode\" : \"00\", \"reasonContext\" : \"登录成功！\"}";
            return jsonResult;
        }else {
            System.out.println("未查询到该用户");
            String jsonResult = "{\"reasonCode\" : \"11\", \"reasonContext\" : \"未查询到该用户！\"}";
            return jsonResult;
        }
    }


}
