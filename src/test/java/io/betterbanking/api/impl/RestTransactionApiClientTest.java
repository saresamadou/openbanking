package io.betterbanking.api.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.betterbanking.model.*;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.test.web.reactive.server.WebTestClient;

import java.io.IOException;
import java.util.List;

/**
 * @author sareaboudousamadou.
 */
class RestTransactionApiClientTest {

    static MockWebServer mockBackEnd;

    @BeforeAll
    static void setUp() throws IOException {
        mockBackEnd = new MockWebServer();
        mockBackEnd.start();
    }

    @AfterAll
    static void tearDown() throws IOException {
        mockBackEnd.shutdown();
    }

    @BeforeEach
    void initialize() {
        String baseUrl = String.format("http://localhost:%s",
                mockBackEnd.getPort() + "/accounts/1234/transactions");

    }


    void getTransactionByAccountNumber() throws JsonProcessingException {

        // Given
        ObjectMapper objectMapper = new ObjectMapper();
        OBTransaction6 obTransaction6 = new OBTransaction6();
        obTransaction6
                .accountId("123456789")
                .creditDebitIndicator(OBCreditDebitCode1.CREDIT)
                .currencyExchange(new OBCurrencyExchange5().unitCurrency("EURO"))
                .amount(new OBActiveOrHistoricCurrencyAndAmount9().amount("100"))
                .merchantDetails(new OBMerchantDetails1().merchantName("SAM"));


        mockBackEnd.enqueue(new MockResponse()
                .setBody(objectMapper.writeValueAsString(List.of(obTransaction6)))
                .addHeader("Content-Type", "application/json"));

        // when


        // Then
        WebTestClient
                .bindToServer()
                .baseUrl("http://localhost:8080")
                .build()
                .get()
                .uri("/accounts/1234/transactions")
                .exchange()
                .expectStatus().isCreated()
                .expectHeader().valueEquals("Content-Type", "application/json")
                .expectBody().isEmpty();

    }

}