package com.zyc.factory;

import com.zyc.dao.UserDao;
import com.zyc.dao.impl.UserDaoImpl;

public class StaticFactory {
    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
