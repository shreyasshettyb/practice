package com.practice.solid.service;

import com.practice.solid.models.SavingAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

class SavingAccountServiceTest {
    @Mock
    SavingAccount bankAccount;

    @InjectMocks
    SavingAccountService savingAccountService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testShowInterest() {
        when(bankAccount.getRateOfInterest()).thenReturn(Double.valueOf(0));
        when(bankAccount.getBalance()).thenReturn(Double.valueOf(0));

        savingAccountService.showInterest();
    }

    @Test
    void testShowInterestCal() {
        when(bankAccount.getInterestCal()).thenReturn("getInterestCalResponse");

        savingAccountService.showInterestCal();
    }

    @Test
    void testDeposit() {
        when(bankAccount.getBalance()).thenReturn(Double.valueOf(0));

        savingAccountService.deposit(Double.valueOf(0));
        verify(bankAccount).setBalance(anyDouble());
    }

    @Test
    void testWithdraw() {
        when(bankAccount.getBalance()).thenReturn(Double.valueOf(0));

        savingAccountService.withdraw(Double.valueOf(0));
        verify(bankAccount).setBalance(anyDouble());
    }

    @Test
    void testGetBankDetails() {
        when(bankAccount.getBankName()).thenReturn("getBankNameResponse");
        when(bankAccount.getBankIFSC()).thenReturn("getBankIFSCResponse");

        savingAccountService.getBankDetails();
    }

    @Test
    void testChangeBank() {
        savingAccountService.changeBank("bankName", "bankIFSC");
        verify(bankAccount).setBankName(anyString());
        verify(bankAccount).setBankIFSC(anyString());
    }
}
