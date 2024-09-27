package com.practice.oops.abstraction;

public class BankImpl extends BankAbstract implements BankInterface{

    Bank bank = new Bank("shreyas",2131456132L);

    @Override
    public Bank getBankDetails() {
        return bank;
    }

    @Override
    public void bankAccountNumber() {
        System.out.println(bank.getAccountNumber());
    }
}
