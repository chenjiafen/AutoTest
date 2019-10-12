package com.course.testng;

import org.testng.annotations.Test;

/**
 * @author tyler.chen
 * @data 2019-10-12 17:51
 */
public class ExceptionTest {

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeException(){
        System.out.println("这是一个失败的 异常测试");
    }

    //这是一个成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这是我的异常测试");
        throw new RuntimeException();


    }
}
