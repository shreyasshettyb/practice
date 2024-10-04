package com.practice.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BankAccountAspects {

    @Before("execution(* com.practice.aop.service.BankAccountService.deposit(..))")
    public void beforeAddMoney() {
        System.out.println("Before adding money...");
    }

    @AfterReturning("execution(* com.practice.aop.service.BankAccountService.withdraw(..))")
    public void afterWithdrawMoney() {
        System.out.println("Withdraw done successfully.");
    }

    @AfterThrowing("execution(* com.practice.aop.service.BankService.changeBank(..))")
    public void afterThrowingChangeBank() {
        System.out.println("Exception occurred while changing bank.");
    }

    @AfterReturning("execution(* com.practice.aop.service.BankService.getBankDetails())")
    public void afterGetBankDetails(JoinPoint joinPoint) {
        System.out.println("After displaying bank details."+joinPoint.getSignature());
    }

    @Around("execution(* com.practice.aop.service.SavingAccountService.showInterest())")
    public Object aroundAddUser(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Around advice: Before showing Interest");
        Object result;
        try {
            result = joinPoint.proceed();
            System.out.println("Around advice: After showing Interest");
        } catch (Throwable throwable) {
            System.out.println("Around advice: Exception occurred");
            throw throwable;
        }
        return result;
    }
}
