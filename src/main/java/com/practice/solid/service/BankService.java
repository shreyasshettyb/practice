package com.practice.solid.service;

import com.practice.solid.models.SavingAccount;
import com.practice.solid.remotes.BankInterface;

import java.util.logging.Logger;

/**
 * {@link BankService} provide service like getting bank details and changing bank.
 */
public class BankService implements BankInterface {

    SavingAccount bankAccount = new SavingAccount("Example Bank", "MYB001244", 12440500001L, "Shreyas", 12000.0,2.7,"Simple");
    Logger logger = Logger.getLogger("BankService");
    /**
     * print bank details
     */
    @Override
    public void getBankDetails() {
        logger.info("Bank Name:"+bankAccount.getBankName());
        logger.info("Bank IFSC:"+bankAccount.getBankIFSC());
    }

    /**
       * Method is used to change the bank name and IFSC code.
     * Method takes to parameters String {@param bankName} & String {@param bankIFSC}
     */
    @Override
    public void changeBank(String bankName, String bankIFSC) {
        bankAccount.setBankName(bankName);
        bankAccount.setBankIFSC(bankIFSC);
    }
}
