package com.practice.solid.service;


import com.practice.solid.remotes.BankAccountInterface;


/**
    *  {@link BankAccountService} used to implement bank generic functions like deposit and withdraw.
 */
public class BankAccountService extends BankService implements BankAccountInterface {

    /**
        * Deposit is used to add {@param amount} to account balance. Will print the balance.
     */
    @Override
    public void deposit(Double amount) {
        bankAccount.setBalance(bankAccount.getBalance() + amount);
        logger.info(()->bankAccount.getBalance().toString());
    }

    /**
        * Withdraw is used to deduct {@param amount} from account balance. Will print the balance.
     */
    @Override
    public void withdraw(Double amount) {
        bankAccount.setBalance(bankAccount.getBalance() - amount);
        logger.info(()->bankAccount.getBalance().toString());
    }

}
