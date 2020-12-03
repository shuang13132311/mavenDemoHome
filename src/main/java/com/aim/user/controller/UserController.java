package com.aim.user.controller;

import com.aim.entity.User;
import com.aim.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    /*@RequestMapping("selectUserById")
    public String selectUserById(int id, Model model){
        System.out.println("访问了controller");
        User user = userService.selectUserById(id);
        model.addAttribute("user", user);
        return "user";
    }*/

    @RequestMapping("/addUser")
    public String addUser(User user){
        System.out.println("访问了addUser！！");
        int flag = userService.addUser(user);
        if(flag != 0){
            System.out.println("添加user成功");
            return "login";
        }else{
            System.out.println("添加失败！");
            return "error";
        }
    }


    @RequestMapping(value="/login",produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public User login(String userName,String userPassword){
        System.out.println("访问了login！！");
        User user = new User();
        user.setUserName(userName);
        user.setUserPassword(userPassword);
        User userInfo = userService.login(user);
        if(userInfo != null){
            System.out.println("查询到该用户，可以登录");
            //去查询当前用户的所有联系人信息
            return userInfo;
        }else {
            return null;
        }
    }


}
