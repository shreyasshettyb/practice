package com.practice.solid.models;

// Single Responsibility Principle
public class Bank {
    private String bankName;
    private String bankIFSC;

    public Bank(String bankName, String bankIFSC) {
        this.bankName = bankName;
        this.bankIFSC = bankIFSC;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankIFSC() {
        return bankIFSC;
    }

    public void setBankIFSC(String bankIFSC) {
        this.bankIFSC = bankIFSC;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankName='" + bankName + '\'' +
                ", bankIFSC='" + bankIFSC + '\'' +
                '}';
    }
}
