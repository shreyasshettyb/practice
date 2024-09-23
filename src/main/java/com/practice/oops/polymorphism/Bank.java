package com.practice.oops.polymorphism;


// Here Bank is an object where we are encapsulating both data and its associated methods.
public class Bank {

    private final Long accountNumber;
    private final String name;

    public Long getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accountNumber=" + accountNumber +
                ", name='" + name + '\'' +
                '}';
    }

    public Bank(String nameVariable, Long accountNumber) {
        this.name = nameVariable;
        this.accountNumber = accountNumber;
    }
}
