package com.practice.aop.remotes;

import org.springframework.stereotype.Repository;

//Interface Segregation Principal
@Repository
public interface BankAccountInterface extends BankInterface {
    void deposit(Double amount);
    void withdraw(Double amount);
}
