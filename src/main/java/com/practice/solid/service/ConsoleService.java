package com.practice.solid.service;

import com.practice.solid.remotes.ConsoleInterface;
import com.practice.solid.remotes.SavingAccountInterface;

import java.util.Scanner;

public class ConsoleService implements ConsoleInterface {
    static SavingAccountInterface bankAccountInterface = new SavingAccountService();
    static Scanner scanner = new Scanner(System.in);
    @Override
    public void showMenu() {
        System.out.println("Enter Option\n1.Deposit\n2.Withdraw\n3.View Bank Details\n4.Savings Interest\n5.Interest Type\n6.Quit");
        int opt = scanner.nextInt();
        switch (opt) {
            case 1 -> deposit();
            case 2 -> withdraw();
            case 3 -> bankDetails();
            case 4 -> interestRate();
            case 5 -> interestType();
            case 6 ->{
                scanner.close();
                System.exit(0);
            }
        }
    }

    public static void deposit(){
        System.out.println("Enter Deposit Amount");
        Double amt = scanner.nextDouble();
        bankAccountInterface.deposit(amt);
    }

    public static void withdraw(){
        System.out.println("Enter Withdraw Amount");
        Double amt = scanner.nextDouble();
        bankAccountInterface.withdraw(amt);
    }

    public static void bankDetails(){
        System.out.println("Bank Details Are:");
        bankAccountInterface.getBankDetails();
    }

    public static void interestRate(){
        System.out.println("Interest Rate is:");
        bankAccountInterface.showInterest();
    }

    public static void interestType(){
        System.out.println("Interest Type is:");
        bankAccountInterface.showInterestCal();
    }
}
