package com.openbanking.app.web;

import com.openbanking.app.domain.Transaction;
import com.openbanking.app.service.TransactionService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.math.BigDecimal;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

/**
 * @author sareaboudousamadou.
 */
@WebMvcTest(controllers = TransactionController.class)
public class TransactionControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TransactionService transactionService;

    @Test
    @DisplayName("/transactions endpoint should return list of transactions for a given accountNumber")
    void getAllTransactions200Test() throws Exception {
        // Given
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

        when(transactionService.findAllByAccountNumber()).thenReturn(List.of(firstTransaction, secondTransaction, thirdTransaction));

        // Then
        mockMvc.perform(get("/transactions/50"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

}
