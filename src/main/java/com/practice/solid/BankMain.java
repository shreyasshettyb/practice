package com.practice.solid;

import com.practice.solid.remotes.ConsoleInterface;
import com.practice.solid.service.ConsoleService;

//Dependency Inversion Principle
public class BankMain {

    public static void main(String[] args) {
        ConsoleInterface consoleInterface = new ConsoleService();
        while(true){
            consoleInterface.showMenu();
        }
    }




}
