package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups="teacher")
public class GroupsOnClass3 {

    public void teacher1(){
        System.out.println("GroupsOnClass3 teacher 1 runs");
    }

    public void teacher2(){
        System.out.println("GroupsOnClass3 teacher 2 runs");
    }
}
