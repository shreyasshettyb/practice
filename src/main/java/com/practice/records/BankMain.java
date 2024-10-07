package com.practice.records;

public class BankMain {
    public static void main(String[] args) {
        Bank bank = new Bank("CanaraBank","CNRB001014");
        //once initialized we cannot change or modify the values.
        // Its is preferred compared to normal class because we can avoid boilerplate codes

        System.out.println("Bank Name:"+bank.bankName());
        System.out.println("BankIFSC:"+bank.bankIFSC());

        //It provides equals method to check if 2 object are equal
        System.out.println(bank.equals(new Bank("CanaraBank","CNRB001014")));
        System.out.println(bank.equals(new Bank("CanaraBank","CNRB001015")));
    }
}
