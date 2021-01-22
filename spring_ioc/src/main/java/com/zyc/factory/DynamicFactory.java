package com.zyc.factory;

import com.zyc.dao.UserDao;
import com.zyc.dao.impl.UserDaoImpl;

public class DynamicFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
