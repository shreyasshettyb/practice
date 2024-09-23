package com.practice.oops.others;

public class Main implements PrivateInterface {
    public static void main(String[] args) {
        System.out.println(StaticExamples.name);
        System.out.println(StaticExamples.getSum(5,5));

        Main test1= new Main();
        System.out.println(test1.hello());
    }
}
