package io.betterbanking.web;

import io.betterbanking.api.impl.RestTransactionApiClient;
import io.betterbanking.service.TransactionService;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.web.server.LocalServerPort;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;

/**
 * @author sareaboudousamadou.
 */
class TransactionComponentTest {

    @LocalServerPort
    private int port;

    private TransactionService transactionService;

    @BeforeEach
    void setUp() {
        RestTransactionApiClient apiClient = new RestTransactionApiClient();
        transactionService = new TransactionService(apiClient);
    }

    @Test
    void testApplicationEndToEnd() {
        given().standaloneSetup(new TransactionController(transactionService))
                .when()
                .get(String.format("http://localhost:%s/transactions/556", port))
                .then()
                .statusCode(Matchers.is(200));

    }
}
