package com.nm.orm.dao.impl;

import com.nm.orm.dao.AccountDao;
import com.nm.orm.entity.Account;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 * 功能说明：TODO
 *
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2016年06月06日上午15:51] 创建方法 by hw
 */
@Repository
@Qualifier("accountDao")
public class AccountDaoImpl extends BaseDaoImpl<Account,String> implements AccountDao {

    public AccountDaoImpl() {
        setEntityClass(Account.class);
    }


}
