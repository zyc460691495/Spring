package com.zyc.service.impl;

import com.zyc.dao.AccountDao;
import com.zyc.service.AccountService;

public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    public AccountDao getAccountDao() {
        return accountDao;
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void transfer(String outMan, String inMan, Double money) {

        accountDao.out(outMan,money);
        int i=5/0;
        accountDao.in(inMan,money);

    }
}
