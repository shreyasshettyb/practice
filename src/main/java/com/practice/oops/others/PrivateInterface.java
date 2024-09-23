package com.practice.oops.others;

public interface PrivateInterface {

    default  String hello() {
        return getString();
    }
    private static String getString(){
        return "hello";
    }
}
