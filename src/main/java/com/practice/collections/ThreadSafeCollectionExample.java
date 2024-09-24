package com.practice.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadSafeCollectionExample {

    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<Integer,String> concurrentHashMap =new ConcurrentHashMap();
        concurrentHashMap.put(1,"Hello");
        concurrentHashMap.put(2,"world");
        concurrentHashMap.forEach((k,v)-> System.out.println(k +" "+ v));

        //Normal HashMap Non Thread Safe data corruption
//        Map<String, Integer> map = new HashMap<>();
//
//        Runnable task = () -> {
//            for (int i = 0; i < 1000; i++) {
//                map.put(Thread.currentThread().getName() + i, i);
//            }
//            map.forEach((k,v)-> System.out.println(k+","+v));
//        };
//
//
//        Thread thread1 = new Thread(task, "Thread-1");
//        Thread thread2 = new Thread(task, "Thread-2");
//
//        thread1.start();
//        thread2.start();
//
//        thread1.join();
//        thread2.join();
//
//        System.out.println("HashMap size: " + map.size());

        //Thread Safe HashMap No data Loss
        Map<String, Integer> map = new ConcurrentHashMap<>();

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                map.put(Thread.currentThread().getName() + i, i);
            }
            map.forEach((k,v)-> System.out.println(k+","+v));
        };

        Thread thread1 = new Thread(task, "Thread-1");
        Thread thread2 = new Thread(task, "Thread-2");

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("ConcurrentHashMap size: " + map.size());
    }


}
