package com.practice.oops.polymorphism;

import java.util.List;

public class BankImpl implements BankInterface {

//    Bank bank = new Bank("shreyas",2131456132L);

    List<Bank> bank = List.of(new Bank("shreyas", 2131456132L), new Bank("akash", 86411541L));

    // Runtime Polymorphism or method overriding
    @Override
    public Bank getBankDetails(String name) {
        return bank.stream().filter(each -> each.getName().equals(name)).findFirst().orElse(null);
    }

    @Override
    public Bank getBankDetails(Long accountId) {
        return bank.stream().filter(each -> each.getAccountNumber().equals(accountId)).findFirst().orElse(null);
    }

}
