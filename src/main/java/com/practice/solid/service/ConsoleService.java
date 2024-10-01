package com.practice.solid.service;

import com.practice.solid.remotes.ConsoleInterface;
import com.practice.solid.remotes.SavingAccountInterface;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * {@link ConsoleService} is used to show the menu options and take input from user.
 */
public class ConsoleService implements ConsoleInterface {
    static SavingAccountInterface bankAccountInterface = new SavingAccountService();
    static Scanner scanner = new Scanner(System.in);
    static Logger logger = Logger.getLogger("ConsoleService");

    /**
        *Method displays the menu, takes input and routes it to respective service methods
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
            default -> logger.warning("Wrong Option!!.Please Try Again");
        }
        return true;
    }

    public static void deposit(){
        logger.info("Enter Deposit Amount");
        Double amt = scanner.nextDouble();
        bankAccountInterface.deposit(amt);
    }

    public static void withdraw(){
        logger.info("Enter Withdraw Amount");
        Double amt = scanner.nextDouble();
        bankAccountInterface.withdraw(amt);
    }

    public static void bankDetails(){
        logger.info("Bank Details Are:");
        bankAccountInterface.getBankDetails();
    }

    public static void interestRate(){
        logger.info("Interest Rate is:");
        bankAccountInterface.showInterest();
    }

    public static void interestType(){
        logger.info("Interest Type is:");
        bankAccountInterface.showInterestCal();
    }
}
