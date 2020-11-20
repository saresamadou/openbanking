package com.openbanking.app.service;

import com.openbanking.app.domain.Transaction;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author sareaboudousamadou.
 */
@Service
public class TransactionService {


    public List<Transaction> findAllByAccountNumber() {
        return getDummyTransactions();
    }

    private List<Transaction> getDummyTransactions() {
        Transaction firstTransaction = Transaction.builder()
                .type("TRANSACTION1")
                .accountNumber(1234)
                .amount(BigDecimal.valueOf(5353, 87))
                .merchantName("Merchant1")
                .currency("EUR")
                .build();
        Transaction secondTransaction = Transaction.builder()
                .type("TRANSACTION2")
                .accountNumber(2234)
                .amount(BigDecimal.valueOf(2353, 27))
                .merchantName("Merchant2")
                .currency("EUR")
                .build();
        Transaction thirdTransaction = Transaction.builder()
                .type("TRANSACTION3")
                .accountNumber(3234)
                .amount(BigDecimal.valueOf(3353, 37))
                .merchantName("Merchant3")
                .currency("EUR")
                .build();
        return List.of(firstTransaction, secondTransaction, thirdTransaction);
    }

}
