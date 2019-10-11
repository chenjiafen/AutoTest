package com.course.testng;

import org.testng.annotations.*;

/**
 * @author tyler.chen
 * @data 2019-10-11 13:39
 */
public class BasicAnnotation {
    @Test
    public void testcase1(){
        System.out.println("这是测试用例1");

    }
    @Test
    public void testcase2(){
        System.out.println("这是测试用例2");
    }
    @BeforeMethod
    public  void beforeMethod(){
        System.out.println("BeforeMethod这是在测试方法之前运行的");

    }
    @AfterMethod
    public void afterMethond(){
        System.out.println("AfterMethod这是在测试方法之后运行的");

    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass这是在类运行之前运行的");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass这是子类运行之后运行的");

    }

    @BeforeSuite
    public  void beforeSuit(){
        System.out.println("BeforeSuit测试套件");

    }

    @AfterSuite
    public void afterSuit(){
        System.out.println("AfterSuit测试套件");
    }
}
