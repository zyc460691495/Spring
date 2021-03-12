package com.zyc.dao;

import com.zyc.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

public class UserDaoTest {

    @Test
    public void test01() throws IOException {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = applicationContext.getBean("userMapper", UserMapper.class);
        List<User> users = userMapper.queryAllUsers();
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void test02() throws IOException {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = applicationContext.getBean("userMapper2", UserMapper.class);
        List<User> users = userMapper.queryAllUsers();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
