package com.practice.solid.remotes;

//Interface Segregation Principal
public interface BankAccountInterface extends BankInterface {
    void deposit(Double amount);
    void withdraw(Double amount);
}
