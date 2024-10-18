package com.practice.solid.service;

import com.practice.solid.models.SavingAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

class BankServiceTest {
    @Mock
    SavingAccount bankAccount;

    @InjectMocks
    BankService bankService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetBankDetails() {
        when(bankAccount.getBankName()).thenReturn("getBankNameResponse");
        when(bankAccount.getBankIFSC()).thenReturn("getBankIFSCResponse");

        bankService.getBankDetails();
    }

    @Test
    void testChangeBank() {
        bankService.changeBank("bankName", "bankIFSC");
        verify(bankAccount).setBankName(anyString());
        verify(bankAccount).setBankIFSC(anyString());
    }
}
