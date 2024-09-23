package com.practice.oops.polymorphism;

public interface BankInterface {

    // compile polymorphism or method overloading
    Bank getBankDetails(String name);
    Bank getBankDetails(Long accountId);
}
