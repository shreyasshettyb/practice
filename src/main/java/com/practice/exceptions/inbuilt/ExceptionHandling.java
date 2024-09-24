package com.practice.exceptions.inbuilt;

public class ExceptionHandling {

    //Arithmetic Exception
    public static void main(String[] args) {
        try{
            System.out.println(2/0); // Divide By Zero Exception
        }catch (ArithmeticException exception){
            System.out.println("Arithmetic Exception handled");
        }
    }

}

