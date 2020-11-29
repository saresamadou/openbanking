package io.betterbanking.web;

import io.betterbanking.service.TransactionService;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.boot.web.server.LocalServerPort;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;

/**
 * @author sareaboudousamadou.
 */
public class TransactionComponentTest {

    @LocalServerPort
    private int port;

    @Test
    public void testApplicationEndToEnd() {
        given().standaloneSetup(new TransactionController(new TransactionService()))
                .when()
                .get(String.format("http://localhost:%s/transactions/556", port))
                .then()
                .statusCode(Matchers.is(200));

    }
}
