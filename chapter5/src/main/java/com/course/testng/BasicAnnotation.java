package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    @Test
    public void testCase1(){
        System.out.println("this is test case 1");
    }

    @Test
    public void testCase2(){
        System.out.println("this is test case 2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod runs before method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod runs after method");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass runs before class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("afterClass runs after class");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite runs before suite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite runs after suite");
    }
}
