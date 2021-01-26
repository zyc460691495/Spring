package com.zyc.web;

import com.zyc.config.SpringConfiguration;
import com.zyc.service.UserService;
import com.zyc.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserController {
    public static void main(String[] args) {
//        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
//        UserService userService = (UserService) applicationContext.getBean("userService");
//        UserServiceImpl userService = applicationContext.getBean(UserServiceImpl.class);
        UserServiceImpl userService = (UserServiceImpl) applicationContext.getBean(UserService.class);
        userService.save();
    }
}
