package com.zyc.dao;

public interface AccountDao {

    public void out(String outMan, Double money);

    public void in(String inMan, Double money);
}
