package com.zyc.service.impl;

import com.zyc.dao.UserDao;
import com.zyc.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save() {
        userDao.save();
    }

}
