package com.course.testng;

import org.testng.annotations.Test;

public class IgnoreTest {

    @Test
    public void ignore1(){
        System.out.println("ignore 1 runs");
    }

    @Test(enabled = false)
    public void ignore2(){
        System.out.println("ignore 2 runs");
    }

    @Test(enabled = true)
    public void ignore3(){
        System.out.println("ignore 3 runs");
    }
}
