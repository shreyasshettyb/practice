package com.practice.threads;

public class Multithreading {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();
        Thread thread = new Thread(myThread2);
        myThread1.start();
        thread.start();
    }
}
class MyThread1 extends Thread{
    public void run(){
        System.out.println("Thread1");
    }
}
class MyThread2 implements Runnable{
    public void run(){
        System.out.println("Thread2");
    }
}
