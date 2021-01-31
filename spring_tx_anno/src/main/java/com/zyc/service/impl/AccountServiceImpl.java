package com.zyc.service.impl;

import com.zyc.dao.AccountDao;
import com.zyc.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Transactional
    public void transfer(String outMan, String inMan, Double money) {

        accountDao.out(outMan,money);
//        int i=1/0;
        accountDao.in(inMan,money);

    }
}
