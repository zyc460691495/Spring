package com.zyc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/test")
    public String save(){
        System.out.println("controller save.....");
        return "success.jsp";
    }
}
