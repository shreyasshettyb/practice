package com.practice.solid.models;

//OCP
public class SavingAccount extends BankAccount {
    private Double rateOfInterest;
    private String interestCal;

    public SavingAccount(String bankName, String bankIFSC, Long accountNumber, String name, Double balance, Double rateOfInterest, String interestCal) {
        super(bankName, bankIFSC, accountNumber, name, balance);
        this.rateOfInterest = rateOfInterest;
        this.interestCal = interestCal;
    }

    public Double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(Double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public String getInterestCal() {
        return interestCal;
    }

    public void setInterestCal(String interestCal) {
        this.interestCal = interestCal;
    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "rateOfInterest=" + rateOfInterest +
                ", interestCal='" + interestCal + '\'' +
                '}';
    }
}
