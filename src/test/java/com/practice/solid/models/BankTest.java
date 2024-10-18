package com.practice.solid.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BankTest {
    Bank bank = new Bank("bankName", "bankIFSC");

    @Test
    void testToString() {
        String result = bank.toString();
        Assertions.assertEquals("replaceMeWithExpectedResult", result);
    }
}

//Generated with love by TestMe :) Please raise issues & feature requests at: https://weirddev.com/forum#!/testme