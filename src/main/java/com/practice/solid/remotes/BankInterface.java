package com.practice.solid.remotes;
//Interface Segregation Principal
public interface BankInterface {
        void getBankDetails();
        void changeBank(String bankName,String bankIFSC);
}
