package com.zyc.dao.impl;

import com.zyc.dao.User;
import com.zyc.dao.UserDao;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class UserDaoImpl implements UserDao {

    public UserDaoImpl(){
        System.out.println("UserDaoImpl默认构造。。。。");
    }

    public void init(){
        System.out.println("初始化。。。。。");
    }
    public void destroy(){
        System.out.println("销毁。。。。。");
    }

    private String userName;
    private int age;
    private String[] array;
    private List<String> stringList;
    private Map<String, User> map;
    private Properties properties;
    private Set set;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public void setMap(Map<String, User> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public void setArray(String[] array) {
        this.array = array;
    }
    public void save() {
        System.out.println(array);
        System.out.println(stringList);
        System.out.println(map);
        System.out.println(properties);
        System.out.println(set);
        System.out.println("save 方法");
    }
}
