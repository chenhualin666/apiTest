package com.course.testng;

import org.testng.annotations.Test;

public class ExpectException {

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFail(){
        System.out.println("this is a run time exception");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("this is a run time exception");
        throw new RuntimeException();
    }
}
