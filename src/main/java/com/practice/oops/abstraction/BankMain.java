package com.practice.oops.abstraction;

public class BankMain {

    public static void main(String[] args) {
        BankInterface bankInterface= new BankImpl();
        // Communicating with interface rather than directly access the Implementation
        System.out.println(bankInterface.getBankDetails().toString());
    }
}
