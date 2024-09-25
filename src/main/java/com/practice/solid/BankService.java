package com.practice.solid;


public class BankService implements BankInterface {
    BankAccount bankAccount = new BankAccount(new Bank("Example Bank", "MYB001244"), 12440500001L, "Shreyas", 12000.0);


    @Override
    public void deposit(Double amount) {
        bankAccount.setBalance(bankAccount.getBalance() + amount);
        System.out.println(bankAccount.getBalance());
    }

    @Override
    public void withdraw(Double amount) {
        bankAccount.setBalance(bankAccount.getBalance() - amount);
        System.out.println(bankAccount.getBalance());
    }
}
