package com.practice.aop.models;

//Single Responsibility Principle
//Open Close Principle
public class BankAccount extends Bank {
    private Long accountNumber;
    private String name;
    private Double balance;

    public BankAccount(String bankName, String bankIFSC, Long accountNumber, String name, Double balance) {
        super(bankName, bankIFSC);
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "bank=" + super.getBankName() +
                ", accountNumber=" + accountNumber +
                ", name='" + name + '\'' +
                '}';
    }
}
