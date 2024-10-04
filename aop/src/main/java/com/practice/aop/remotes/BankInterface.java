package com.practice.aop.remotes;

import org.springframework.stereotype.Repository;

//Interface Segregation Principal
@Repository
public interface BankInterface {
        void getBankDetails();
        void changeBank(String bankName,String bankIFSC);
}
