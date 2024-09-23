package com.practice.basics.wrapper;

public class WrapperExamples {


    public static void main(String[] args) {
        Integer test1;
        Float test2;
        Double test3;
        Long test4;
        test1 = 8;
        test2=2f;
        test3=2.0;
        test4=25L;

        System.out.println(test1.compareTo(4));
        System.out.println(test2.byteValue());
        System.out.println(test3.equals(2.0));
        System.out.println(test4.intValue());

    }


}
