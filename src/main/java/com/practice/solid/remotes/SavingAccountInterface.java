package com.practice.solid.remotes;
//Interface Segregation Principal
public interface SavingAccountInterface extends BankAccountInterface {
    void showInterest();
    void showInterestCal();

}
