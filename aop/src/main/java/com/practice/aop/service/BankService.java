package com.practice.aop.service;

import com.practice.aop.models.SavingAccount;
import com.practice.aop.remotes.BankInterface;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

/**
 * {@link BankService} provide service like getting bank details and changing bank.
 */
@Service
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
        throw new RuntimeException("Feature coming soon");
    }
}
