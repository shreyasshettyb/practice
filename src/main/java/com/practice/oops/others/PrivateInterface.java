package com.practice.oops.others;

public interface PrivateInterface {

    //Will execute first
    default  String hello() {
        return getString();
    }

    private static String getString(){
        return "hello";
    }
}
