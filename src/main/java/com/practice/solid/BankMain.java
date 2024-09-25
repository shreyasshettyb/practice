package com.practice.solid;

import java.util.Scanner;

//Dependency Inversion Principle
public class BankMain {
   static BankInterface bankInterface = new BankService();
   static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

       while(true){
            System.out.println("Enter Option\n1.Deposit\n2.Withdraw\n3.Quit");
            int opt = scanner.nextInt();
            switch (opt) {
                case 1 -> deposit();
                case 2 -> withdraw();
                case 3 ->{
                    scanner.close();
                    System.exit(0);
                }
            }
        }
    }

    public static void deposit(){
        System.out.println("Enter Deposit Amount");
        Double amt = scanner.nextDouble();
        bankInterface.deposit(amt);
    }

    public static void withdraw(){
        System.out.println("Enter Withdraw Amount");
        Double amt = scanner.nextDouble();
        bankInterface.withdraw(amt);
    }


}
