package com.practice.oops.encapsulation;


// Here Bank is an object where we are encapsulating both data and its associated methods.
public class Bank {

    private Long accountNumber;
    private String Name;

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
