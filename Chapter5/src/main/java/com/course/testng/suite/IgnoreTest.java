package com.course.testng.suite;

import org.testng.annotations.Test;

/**
 * @author tyler.chen
 * @data 2019-10-11 17:30
 */
public class IgnoreTest {

    @Test
    public void ignore1(){
        System.out.println("ignot1 执行了");
    }

    @Test(enabled = false)
    public void ignore2(){
        System.out.println("ignor2 执行了");
    }
}
