package com.openbanking.app.service;

import com.openbanking.app.domain.Transaction;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;


/**
 * @author sareaboudousamadou.
 */
class TransactionServiceTest {

    private TransactionService transactionService;

    @BeforeEach
    void setUp() {
        transactionService = new TransactionService();
    }

    @Test
    void findAllByAccountNumberTest() {
        // When
        List<Transaction> transactionsReturned = transactionService.findAllByAccountNumber();

        // Then
        Assertions.assertThat(transactionsReturned.size()).isEqualTo(3);
    }
}