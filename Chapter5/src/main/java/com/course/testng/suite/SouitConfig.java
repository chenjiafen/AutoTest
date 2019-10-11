package com.course.testng.suite;

import org.testng.annotations.*;

/**
 * @author tyler.chen
 * @data 2019-10-11 15:03
 */
public class SouitConfig {

    @BeforeSuite
    public void beforeSuit(){
        System.out.println("before Suite 运行啦");
    }

    @AfterSuite
    public void afterSuit(){
        System.out.println("after Suite 运行了");
    }


    @BeforeTest
    public void test(){
        System.out.println("BeforeTest");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("AfterTest");
    }
}
