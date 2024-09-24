package com.practice.exceptions.custom;

public class MyException extends Exception{
    public MyException(){
        super("Name Cannot be LowerCase");
    }
}
