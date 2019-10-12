package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * @author tyler.chen
 * @data 2019-10-12 15:48
 */

@Test(groups = "test")
public class GroupOnClass1 {


    public void test01(){
        System.out.println("运行test01");
    }

    public void test02(){
        System.out.println("运行test02");

    }

}
