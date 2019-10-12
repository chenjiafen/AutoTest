package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * @author tyler.chen
 * @data 2019-10-12 15:53
 */
@Test(groups = "stu")
public class GroupOnGroup3 {

    public void stu1(){
        System.out.println("执行了stu1");

    }

    public void stu2(){
        System.out.println("执行了stu2");

    }
}
