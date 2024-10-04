package com.practice.aop;

import com.practice.aop.service.ConsoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class AopApplication implements CommandLineRunner {

    @Autowired
    private ConsoleService consoleService; // Autowired Spring-managed bean

    public static void main(String[] args) {
        SpringApplication.run(AopApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Use Spring-managed beans
        boolean loopCondition = true;
        while (loopCondition) {
            loopCondition = consoleService.showMenu();
        }
    }
}
