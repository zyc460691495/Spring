package com.zyc.controller;

import com.zyc.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class UserController {
    public static void main(String[] args) {
//        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.save();
//        new AnnotationConfigApplicationContext()
    }
}
