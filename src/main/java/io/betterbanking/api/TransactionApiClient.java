package io.betterbanking.api;

import io.betterbanking.domain.Transaction;

import java.util.List;

/**
 * @author sareaboudousamadou.
 */
public interface TransactionApiClient {
    List<Transaction> getTransactionByAccountNumber(long accountNumber);
}
