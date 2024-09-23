package com.practice.oops.inhertance;

import java.time.LocalDate;

//Multi-Level Inheritance  Bank -> Account -> FD
public class FixedDeposit extends Account{
    private Double interestRate;
    private LocalDate maturityDate;

    public FixedDeposit(String bankName, String ifscCode, Long pincode, Double interestRate, LocalDate maturityDate) {
        super(bankName, ifscCode, pincode);
        this.interestRate = interestRate;
        this.maturityDate = maturityDate;
    }

    public FixedDeposit(String bankName, String ifscCode, Long pincode, Long accountNumber, String accountName, Double accountBalance, Double interestRate, LocalDate maturityDate) {
        super(bankName, ifscCode, pincode, accountNumber, accountName, accountBalance);
        this.interestRate = interestRate;
        this.maturityDate = maturityDate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public LocalDate getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate(LocalDate maturityDate) {
        this.maturityDate = maturityDate;
    }

    @Override
    public String toString() {
        return "FixedDeposit{" +
                "interestRate=" + interestRate +
                ", maturityDate=" + maturityDate +
                '}';
    }
}
