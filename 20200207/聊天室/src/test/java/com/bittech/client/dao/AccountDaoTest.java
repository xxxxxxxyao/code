package com.bittech.client.dao;

import com.bittech.client.entity.User;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author: BaiMiao
 * @Date: 2020/1/7 11:39
 * @Description:
 */
public class AccountDaoTest {
private AccountDao accountDao=new AccountDao();
    @Test
    public void userReg() {
        User user=new User();
        user.setUsername("test");
        user.setPassword("123");
        user.setBrief("棒");
        boolean b=accountDao.userReg(user);
        Assert.assertTrue(b);
    }

    @Test
    public void userLogin() {
        User user=accountDao.userLogin("test","123");
        Assert.assertNotNull(user);
    }
}