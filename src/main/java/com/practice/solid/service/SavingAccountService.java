package com.practice.solid.service;

import com.practice.solid.remotes.SavingAccountInterface;

public class SavingAccountService extends BankAccountService implements SavingAccountInterface {

    @Override
    public void showInterest() {
        logger.info("Interest Amount:"+bankAccount.getBalance()*((bankAccount.getRateOfInterest()+100)/100));
    }

    @Override
    public void showInterestCal() {
        logger.info(bankAccount.getInterestCal());
    }
}
