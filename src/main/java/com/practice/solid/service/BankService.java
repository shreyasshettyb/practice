package com.practice.solid.service;

import com.practice.solid.models.SavingAccount;
import com.practice.solid.remotes.BankInterface;

public class BankService implements BankInterface {

    SavingAccount bankAccount = new SavingAccount("Example Bank", "MYB001244", 12440500001L, "Shreyas", 12000.0,2.7,"Simple");

    @Override
    public void getBankDetails() {
        System.out.println("Bank Name:"+bankAccount.getBankName());
        System.out.println("Bank IFSC:"+bankAccount.getBankIFSC());
    }

    @Override
    public void changeBank(String bankName, String bankIFSC) {
        bankAccount.setBankName(bankName);
        bankAccount.setBankIFSC(bankIFSC);
    }
}
