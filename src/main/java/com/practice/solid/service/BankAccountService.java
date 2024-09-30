package com.practice.solid.service;


import com.practice.solid.remotes.BankAccountInterface;

public class BankAccountService extends BankService implements BankAccountInterface {

    @Override
    public void deposit(Double amount) {
        bankAccount.setBalance(bankAccount.getBalance() + amount);
        logger.info(bankAccount.getBalance().toString());
    }

    @Override
    public void withdraw(Double amount) {
        bankAccount.setBalance(bankAccount.getBalance() - amount);
        logger.info(bankAccount.getBalance().toString());
    }

}
