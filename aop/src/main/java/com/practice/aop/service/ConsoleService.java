package com.practice.aop.service;


import com.practice.aop.remotes.ConsoleInterface;
import com.practice.aop.remotes.SavingAccountInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * {@link ConsoleService} is used to show the menu options and take input from user.
 */
@Service
public class ConsoleService implements ConsoleInterface {

    static Scanner scanner = new Scanner(System.in);
    static Logger logger = Logger.getLogger("ConsoleService");
    private final SavingAccountInterface bankAccountInterface;

    @Autowired
    public ConsoleService(SavingAccountService savingAccountService) {
        this.bankAccountInterface = savingAccountService;
    }

    public void deposit() {
        logger.info("Enter Deposit Amount");
        Double amt = scanner.nextDouble();
        bankAccountInterface.deposit(amt);
    }

    public void withdraw() {
        logger.info("Enter Withdraw Amount");
        Double amt = scanner.nextDouble();
        bankAccountInterface.withdraw(amt);
    }

    public void bankDetails() {
        logger.info("Bank Details Are:");
        bankAccountInterface.getBankDetails();
    }

    public void interestRate() {
        logger.info("Interest Rate is:");
        bankAccountInterface.showInterest();
    }

    public void interestType() {
        logger.info("Interest Type is:");
        bankAccountInterface.showInterestCal();
    }

    public void changeBank() {
        bankAccountInterface.changeBank("xyz", "XYZ5455");
    }

    /**
     * Method displays the menu, takes input and routes it to respective service methods
     *
     * @return {@code true} if loop should continue and {@code false} if quit
     */
    @Override
    public boolean showMenu() {
        logger.info("Enter Option\n1.Deposit\n2.Withdraw\n3.View Bank Details\n4.Savings Interest\n5.Interest Type\n6.Quit");
        int opt = scanner.nextInt();
        switch (opt) {
            case 1 -> deposit();
            case 2 -> withdraw();
            case 3 -> bankDetails();
            case 4 -> interestRate();
            case 5 -> interestType();
            case 6 -> {
                scanner.close();
                return false;
            }
            case 7 -> {
                try {
                    changeBank();
                } catch (RuntimeException e) {
                    System.out.println("Error!!!");
                }
            }
            default -> logger.warning("Wrong Option!!.Please Try Again");
        }
        return true;
    }
}
