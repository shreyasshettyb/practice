package com.practice.oops.inhertance;


//Hierarchical Interference
public class Account extends Bank{
    public Account(String bankName, String ifscCode, Long pincode) {
        super(bankName, ifscCode, pincode);
    }

    private Long accountNumber;
    private String accountName;
    private Double accountBalance;


    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Account(String bankName, String ifscCode, Long pincode, Long accountNumber, String accountName, Double accountBalance) {
        super(bankName, ifscCode, pincode);
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", accountName='" + accountName + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
