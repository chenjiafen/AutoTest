package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * @author tyler.chen
 * @data 2019-10-12 15:53
 */

@Test(groups = "group2")

public class GroupOnClass2 {

    public void char1(){
        System.out.println("运行char1");
    }
    public void char2(){
        System.out.println("运行char2");
    }

}
