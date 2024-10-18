package com.practice.solid.service;

import com.practice.solid.models.SavingAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class BankAccountServiceTest {
    @Mock
    SavingAccount bankAccount;

    @InjectMocks
    BankAccountService bankAccountService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testDeposit() {
        when(bankAccount.getBalance()).thenReturn(Double.valueOf(0));

        bankAccountService.deposit(Double.valueOf(0));
        verify(bankAccount).setBalance(anyDouble());
    }

    @Test
    void testWithdraw() {
        when(bankAccount.getBalance()).thenReturn(Double.valueOf(0));

        bankAccountService.withdraw(Double.valueOf(0));
        verify(bankAccount).setBalance(anyDouble());
    }

    @Test
    void testGetBankDetails() {
        when(bankAccount.getBankName()).thenReturn("getBankNameResponse");
        when(bankAccount.getBankIFSC()).thenReturn("getBankIFSCResponse");

        bankAccountService.getBankDetails();
    }

    @Test
    void testChangeBank() {
        bankAccountService.changeBank("bankName", "bankIFSC");
        verify(bankAccount).setBankName(anyString());
        verify(bankAccount).setBankIFSC(anyString());
    }
}
