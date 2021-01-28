package com.zyc.dao.impl;

import com.zyc.dao.AccountDao;
import org.springframework.jdbc.core.JdbcTemplate;

public class AccountDaoImpl implements AccountDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate=jdbcTemplate;
    }

    public void out(String outMan, Double money) {
        jdbcTemplate.update("update account set money=money-? where name =?",money,outMan);
    }

    public void in(String inMan, Double money) {
        jdbcTemplate.update("update account set money=money+? where name =?",money,inMan);
    }
}
