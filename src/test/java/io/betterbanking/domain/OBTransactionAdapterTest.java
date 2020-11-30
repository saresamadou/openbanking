package io.betterbanking.domain;

import io.betterbanking.model.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author sareaboudousamadou.
 */
class OBTransactionAdapterTest {


    @Test
    void adaptOBTransaction6ToTransaction() {
        // Given
        OBTransactionAdapter adapter = new OBTransactionAdapter();
        OBTransaction6 obTransaction6 = new OBTransaction6();
        obTransaction6
                .accountId("123456789")
                .creditDebitIndicator(OBCreditDebitCode1.CREDIT)
                .currencyExchange(new OBCurrencyExchange5().unitCurrency("EURO"))
                .amount(new OBActiveOrHistoricCurrencyAndAmount9().amount("100"))
                .merchantDetails(new OBMerchantDetails1().merchantName("SAM"));

        // When
        Transaction transaction = adapter.adaptOBTransaction6ToTransaction(obTransaction6);

        // Then


        assertEquals(123456789, transaction.getAccountNumber());
        assertEquals("Credit", transaction.getType());
        assertEquals("100", transaction.getAmount());
        assertEquals("EURO", transaction.getCurrency());
        assertEquals("SAM", transaction.getMerchantName());
    }
}