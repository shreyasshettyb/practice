package com.practice.oops.others;

public class Main implements PrivateInterface {
    public static void main(String[] args) {
        //Static example
        System.out.println(StaticExamples.name);
        System.out.println(StaticExamples.getSum(5,5));

        //Private Interface Example
        Main test1= new Main();
        System.out.println(test1.hello());
    }
}
