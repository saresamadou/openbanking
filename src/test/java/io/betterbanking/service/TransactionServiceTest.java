package io.betterbanking.service;

import io.betterbanking.api.impl.RestTransactionApiClient;
import io.betterbanking.domain.Transaction;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.mockito.Mockito.when;


/**
 * @author sareaboudousamadou.
 */
@RunWith(MockitoJUnitRunner.class)
class TransactionServiceTest {

    private TransactionService transactionService;

    @Mock
    private RestTransactionApiClient restTransactionApiClient;

    @BeforeEach
    void setUp() {
        transactionService = new TransactionService(restTransactionApiClient);
    }

    @Test
    void findAllByAccountNumberTest() {
        // Given

        Transaction firstTransaction = Transaction.builder()
                .type("TRANSACTION1")
                .accountNumber(1234)
                .amount("5353, 87")
                .merchantName("Merchant1")
                .currency("EUR")
                .build();
        Transaction secondTransaction = Transaction.builder()
                .type("TRANSACTION2")
                .accountNumber(2234)
                .amount("2353, 27")
                .merchantName("Merchant2")
                .currency("EUR")
                .build();
        Transaction thirdTransaction = Transaction.builder()
                .type("TRANSACTION3")
                .accountNumber(3234)
                .amount("3353, 37")
                .merchantName("Merchant3")
                .currency("EUR")
                .build();

        when(restTransactionApiClient.getTransactionByAccountNumber(Mockito.anyLong()))
                .thenReturn(List.of(firstTransaction, secondTransaction, thirdTransaction));

        // When
        List<Transaction> transactionsReturned = transactionService.findAllByAccountNumber(123);

        // Then
        Assertions.assertThat(transactionsReturned.size()).isEqualTo(3);
    }
}