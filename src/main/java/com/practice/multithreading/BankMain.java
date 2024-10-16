package com.practice.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BankMain {
    public static void main(String[] args) {
        long stime=System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(BankMain::test);
        executorService.shutdown();
        System.out.println(System.currentTimeMillis()-stime);

    }

    public static void test(){
        String eg ="";
        eg+="test";
        eg+="test2";
        System.out.println(eg);
    }
}
