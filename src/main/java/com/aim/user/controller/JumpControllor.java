package com.aim.user.controller;


import com.aim.entity.Contact;
import com.aim.entity.User;
import com.aim.user.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class JumpControllor {
    @Autowired
    private ContactService contactService;


    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }

    @RequestMapping("/toIndex")
    public String toIndex(Model model, HttpSession session){
        User user = (User) session.getAttribute("userInfo");
        Integer userId = user.getUserId();
        List<Contact> contactList = contactService.seleceAllContactByUserId(userId);
        for (Contact contact : contactList){
            System.out.println(contact);
        }
        model.addAttribute("contactList", contactList);
        model.addAttribute("user", user);
        return "index";
    }
}
