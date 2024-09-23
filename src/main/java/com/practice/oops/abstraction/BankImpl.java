package com.practice.oops.abstraction;

public class BankImpl implements BankInterface{

    Bank bank = new Bank("shreyas",2131456132L);

    @Override
    public Bank getBankDetails() {
        return bank;
    }
}
