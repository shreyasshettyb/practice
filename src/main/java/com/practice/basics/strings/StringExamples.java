package com.practice.basics.strings;

public class StringExamples {

    public static void main(String[] args) {
        String str1 = "hello"; // here hello is considered has a string object

        String str2 = new String("hello"); // here an object is created with value hello;

        // String is immutable but reference is not, in the sense the reference can be changed any time.
        // We have multiple methods in String

        String test1=str1.toUpperCase();

        String test2 = str2.toLowerCase();

        String test3 = str1.concat(" world");

        String test4 = test3.trim();

        boolean stringBoolean = str1.equalsIgnoreCase(str2);
    }



}
