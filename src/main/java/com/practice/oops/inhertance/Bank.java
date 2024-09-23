package com.practice.oops.inhertance;


//Parent Class
public class Bank {

    private String bankName;
    private String ifscCode;
    private Long pincode;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public Long getPincode() {
        return pincode;
    }

    public void setPincode(Long pincode) {
        this.pincode = pincode;
    }

    public Bank(String bankName, String ifscCode, Long pincode) {
        this.bankName = bankName;
        this.ifscCode = ifscCode;
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankName='" + bankName + '\'' +
                ", ifscCode='" + ifscCode + '\'' +
                ", pincode=" + pincode +
                '}';
    }
}
