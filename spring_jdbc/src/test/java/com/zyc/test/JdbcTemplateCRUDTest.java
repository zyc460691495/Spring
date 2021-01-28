package com.zyc.test;


import com.zyc.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class JdbcTemplateCRUDTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void createTest(){
        //增加
        jdbcTemplate.update("insert into account values (?,?)", "美人鱼战士", 20000);
    }

    @Test
    public void updateTest(){
        //修改
        jdbcTemplate.update("update account set money=? where name=?",100,"美人鱼战士");
    }

    @Test
    public void deleteTest(){
        //删除
        jdbcTemplate.update("delete from account where name=?","张三");
    }

    @Test
    public void queryAllTest(){
        //查询所有
        List<Account> query = jdbcTemplate.query("select * from account", new BeanPropertyRowMapper<Account>(Account.class));
        for (Account account:query){
            System.out.println(account);
        }
    }

    @Test
    public void queryOneTest(){
        //查询单个
        Account account = jdbcTemplate.queryForObject("select * from account where name=?", new BeanPropertyRowMapper<Account>(Account.class), "企鹅男孩");
        System.out.println(account);
    }

    @Test
    public void queryNumTest(){
        //聚合查询
        Integer integer = jdbcTemplate.queryForObject("select count(*) from account", Integer.class);
        System.out.println(integer);
    }

}
