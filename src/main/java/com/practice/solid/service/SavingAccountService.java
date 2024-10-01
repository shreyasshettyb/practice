package com.practice.solid.service;

import com.practice.solid.remotes.SavingAccountInterface;

/**
 * {@link SavingAccountService} provides Service like showing Interest rate and Interest Calculation
 */
public class SavingAccountService extends BankAccountService implements SavingAccountInterface {

    /**
     * Method Prints Interest Rate based on the formula P*(R+100)/100
     */
    @Override
    public void showInterest() {
        logger.info("Interest Amount:"+bankAccount.getBalance()*((bankAccount.getRateOfInterest()+100)/100));
    }

    /**
     * Method prints how is interest calculated
     */
    @Override
    public void showInterestCal() {
        logger.info(bankAccount.getInterestCal());
    }
}
