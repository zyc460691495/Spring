package com.zyc.test;


import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.beans.PropertyVetoException;

public class JdbcTemplateTest {

    @Test
    public void test1() throws PropertyVetoException {

        //创建数据源
        ComboPooledDataSource dataSource=new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/spring_jdbc?serverTimezone=UTC");
        dataSource.setUser("root");
        dataSource.setPassword("123456");


        JdbcTemplate jdbcTemplate=new JdbcTemplate();
        //设置数据源，知道数据库在哪，connection
        jdbcTemplate.setDataSource(dataSource);

        //执行操作
        int row = jdbcTemplate.update("insert into account values (?,?)", "美人鱼战士", 20000);
        System.out.println(row);
    }

    @Test
    public void test2() throws PropertyVetoException {

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) applicationContext.getBean("jdbcTemplate");
        //执行操作
        int row = jdbcTemplate.update("insert into account values (?,?)", "张三", 2500);
        System.out.println(row);
    }



}
