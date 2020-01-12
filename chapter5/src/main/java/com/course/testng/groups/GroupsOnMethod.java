package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {

    @Test(groups="server")
    public void test1(){
        System.out.println("server test case 1111");
    }

    @Test(groups="server")
    public void test2(){
        System.out.println("server test case 2222");
    }

    @Test(groups="client")
    public void test3(){
        System.out.println("server test case 3333");
    }

    @Test(groups="client")
    public void test4(){
        System.out.println("server test case 4444");
    }

    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("before groups on server runs");
    }

    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.println("after groups on server runs");
    }

    @BeforeGroups("client")
    public void beforeGroupsOnClient(){
        System.out.println("before groups on client runs");
    }

    @AfterGroups("client")
    public void afterGroupsOnClient(){
        System.out.println("after groups on client runs");
    }
}
