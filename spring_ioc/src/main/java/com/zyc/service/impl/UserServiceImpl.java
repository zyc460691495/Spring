package com.zyc.service.impl;

import com.zyc.dao.UserDao;
import com.zyc.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserServiceImpl() {
    }

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
//        下面的代码就不需要了，userDao已经在Spring容器中被初始化了   dao注入给service
//        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserDao userDao = (UserDao) app.getBean("userDao");
        userDao.save();
    }
}
