package com.practice.exceptions.custom;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("Enter Your Name in Upper Case");
            String name = new Scanner(System.in).next();
            checkValidInput(name);
        }catch (MyException exception){
            System.out.println(exception.getMessage());
        }

        finally {
            System.out.println("Shutting Down");
        }
    }

    public static void checkValidInput(String name) throws MyException {
        if (!name.equals(name.toUpperCase())) {
            throw new MyException();
        }
    }

}


