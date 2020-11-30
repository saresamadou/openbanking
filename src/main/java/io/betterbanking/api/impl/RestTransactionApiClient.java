package io.betterbanking.api.impl;

import io.betterbanking.api.TransactionApiClient;
import io.betterbanking.domain.OBTransactionAdapter;
import io.betterbanking.domain.Transaction;
import io.betterbanking.model.OBTransaction6;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author sareaboudousamadou.
 */
public class RestTransactionApiClient implements TransactionApiClient {

    @Value("${open-banking.remote.url}")
    private String remoteApiServerUrl;

    @Override
    public List<Transaction> getTransactionByAccountNumber(long accountNumber) {
        List<Transaction> transactions = List.of();
        WebClient webClient = WebClient.create(remoteApiServerUrl);
        WebClient.RequestBodySpec requestBodySpec = webClient
                .method(HttpMethod.GET)
                .uri("/accounts/" + accountNumber + "/transactions");
        List<OBTransaction6> response = Objects.requireNonNull(requestBodySpec.exchange()
                .block())
                .bodyToFlux(OBTransaction6.class).collectList().block();

        if (response != null) {
            transactions = response
                    .stream()
                    .map(OBTransactionAdapter::adaptOBTransaction6ToTransaction)
                    .collect(Collectors.toList());
        }

        return transactions;
    }
}
