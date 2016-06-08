package com.nm.service.ser.impl;

import com.nm.orm.dao.AccountDao;
import com.nm.orm.entity.Account;
import com.nm.service.ser.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * 功能说明：TODO
 *
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2016年06月07日上午11:43] 创建方法 by hw
 */
@Service
@Qualifier("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    public String insert(Account account) {
        return accountDao.insert(account);
    }

    public void saveOrUpdate(Account account) {
        this.accountDao.saveOrUpdate(account);
    }

    public void insert(Collection<Account> accounts) {
        this.accountDao.insert(accounts);
    }

    public Account findById(String accountId) {
        return this.accountDao.findById(accountId);
    }

    public void delete(Account account) {
        this.accountDao.delete(account);
    }

    public int deleteAll(Account account) {
        return this.accountDao.deleteAll(account);
    }

    public int deleteById(String accountId) {
        return this.accountDao.deleteById(accountId);
    }
}
