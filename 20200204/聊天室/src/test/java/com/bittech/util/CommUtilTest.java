package com.bittech.util;

import org.junit.Assert;
import org.junit.Test;

import java.util.Properties;

import static org.junit.Assert.*;

/**
 * @Author: BaiMiao
 * @Date: 2020/1/7 10:33
 * @Description:
 */
public class CommUtilTest {

    @Test
    public void loadProperties() {
        Properties pros=CommUtil.loadProperties("db.properties");
        Assert.assertNotNull(pros);
    }
}