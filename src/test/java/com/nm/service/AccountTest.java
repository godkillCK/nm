package com.nm.service;

import com.nm.orm.dao.AccountDao;
import com.nm.service.ser.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 功能说明：TODO
 * @return <br/>
 *         修改历史：<br/>
 *         1.[2016年06月06日上午16:25] 创建方法 by hw
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
@ComponentScan("com.nm")
public class AccountTest extends AbstractJUnit4SpringContextTests {
    private static Logger LOG = LoggerFactory.getLogger(AccountTest.class);

    @Autowired
    private AccountService accountService;

    @Test
    public void testAccount() {
        System.out.println(accountService);
        accountService.findById("123");
        System.out.println(123);
    }

}
