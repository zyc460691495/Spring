package com.zyc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public interface AccountDao {

    public void out(String outMan,Double money);

    public void in(String inMan,Double money);
}
