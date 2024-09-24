package com.practice.threads;

import java.util.ArrayList;
import java.util.List;

public class SyncExamples {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> arrayList = new ArrayList<>();

        Runnable runnable = () -> {
            synchronized (arrayList) {
                for (int i = 0; i < 1000; i++) {
                    arrayList.add(i);
                }
//            System.out.println(arrayList.size());
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread1.join(); // Makes the main thread wait till completion of the thread1
        thread2.join(); // Makes the main thread wait till completion of the thread2

        arrayList.forEach(System.out::println);
        System.out.println(arrayList.size());


    }
}
