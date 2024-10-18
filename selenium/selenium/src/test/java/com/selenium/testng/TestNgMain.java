package com.selenium.testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgMain {

    @BeforeTest
    public void beforeTest(){
        System.out.println("Before");
    }

    @Test
    public void test(){
        System.out.println("Testing...");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After");
    }
}
