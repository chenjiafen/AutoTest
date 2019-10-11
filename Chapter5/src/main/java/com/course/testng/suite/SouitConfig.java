package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

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
}
