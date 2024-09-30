package com.practice.solid.service;

import com.practice.solid.models.SavingAccount;
import com.practice.solid.remotes.BankInterface;

import java.util.logging.Logger;

public class BankService implements BankInterface {

    SavingAccount bankAccount = new SavingAccount("Example Bank", "MYB001244", 12440500001L, "Shreyas", 12000.0,2.7,"Simple");
    Logger logger = Logger.getLogger("BankService");
    @Override
    public void getBankDetails() {
        logger.info("Bank Name:"+bankAccount.getBankName());
        logger.info("Bank IFSC:"+bankAccount.getBankIFSC());
    }

    @Override
    public void changeBank(String bankName, String bankIFSC) {
        bankAccount.setBankName(bankName);
        bankAccount.setBankIFSC(bankIFSC);
    }
}
