package com.course.testng.multipleThread;

import org.testng.annotations.Test;

public class MultipleThread {

    @Test(invocationCount = 10,threadPoolSize = 5)
    public void test(){
        System.out.println(1);
        System.out.printf("thread id : %s%n", Thread.currentThread().getId());
    }
}
