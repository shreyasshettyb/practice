package com.practice.oops.polymorphism;

public class BankMain {

    public static void main(String[] args) {
        BankInterface bankInterface= new BankImpl();
        System.out.println(bankInterface.getBankDetails("shreyas").toString());
        System.out.println(bankInterface.getBankDetails(2131456132L).toString());
    }
}
