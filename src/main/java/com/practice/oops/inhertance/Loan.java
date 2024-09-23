package com.practice.oops.inhertance;

//Hierarchical Interference
public class Loan extends Bank{
    private Long loanAccount;
    private String loanType;
    private Double interestRate;
    private Integer tenure;

    public Loan(String bankName, String ifscCode, Long pincode, Long loanAccount, String loanType, Double interestRate, Integer tenure) {
        super(bankName, ifscCode, pincode);
        this.loanAccount = loanAccount;
        this.loanType = loanType;
        this.interestRate = interestRate;
        this.tenure = tenure;
    }

    public Long getLoanAccount() {
        return loanAccount;
    }

    public void setLoanAccount(Long loanAccount) {
        this.loanAccount = loanAccount;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public Integer getTenure() {
        return tenure;
    }

    public void setTenure(Integer tenure) {
        this.tenure = tenure;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "loanAccount=" + loanAccount +
                ", loanType='" + loanType + '\'' +
                ", interestRate=" + interestRate +
                ", tenure=" + tenure +
                '}';
    }
}
