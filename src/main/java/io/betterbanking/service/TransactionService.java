package io.betterbanking.service;

import io.betterbanking.api.impl.RestTransactionApiClient;
import io.betterbanking.domain.Transaction;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpServerErrorException;

import java.util.List;

/**
 * @author sareaboudousamadou.
 */
@Service
@Slf4j
public class TransactionService {

    private RestTransactionApiClient restTransactionApiClient;

    public TransactionService(RestTransactionApiClient restTransactionApiClient) {
        this.restTransactionApiClient = restTransactionApiClient;
    }

    @CircuitBreaker(name = "RestTransactionApiClient", fallbackMethod = "fallback")
    public List<Transaction> findAllByAccountNumber(long accountNumber) {
        log.info("Finding all transaction for account number" + accountNumber);
        return restTransactionApiClient.getTransactionByAccountNumber(accountNumber);
    }

    private List<Transaction> fallback(HttpServerErrorException ex) {
        return List.of();
    }

}
