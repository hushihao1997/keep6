package com.rj.controller;

import com.rj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/find")
    public String findAll(){
        System.out.println("请求成功");
        userService.findAll();
        return "success";
    }
}
