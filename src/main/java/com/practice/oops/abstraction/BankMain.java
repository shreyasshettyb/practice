package com.practice.oops.abstraction;

public class BankMain {

    public static void main(String[] args) {
        BankInterface bankInterface= new BankImpl();
        BankAbstract bankAbstract = new BankImpl();
        // Communicating with interface rather than directly access the Implementation
        System.out.println(bankInterface.getBankDetails().toString());
        //Calling the method using interface
        bankInterface.bankAccountNumber();
        //Calling the method using abstract class
        bankAbstract.bankAccountNumber();
    }
}
