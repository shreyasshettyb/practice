package com.practice.solid;

//Single Responsibility Principle
//Open Close Principle
public class BankAccount {
    private Bank bank;
    private Long accountNumber;
    private String name;
    private Double balance;

    public BankAccount(Bank bank, Long accountNumber, String name, Double balance) {
        this.bank = bank;
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

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "bank=" + bank +
                ", accountNumber=" + accountNumber +
                ", name='" + name + '\'' +
                '}';
    }
}
