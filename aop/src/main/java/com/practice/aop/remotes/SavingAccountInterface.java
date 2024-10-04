package com.practice.aop.remotes;

import org.springframework.stereotype.Repository;

//Interface Segregation Principal
@Repository
public interface SavingAccountInterface extends BankAccountInterface {
    void showInterest();
    void showInterestCal();

}
