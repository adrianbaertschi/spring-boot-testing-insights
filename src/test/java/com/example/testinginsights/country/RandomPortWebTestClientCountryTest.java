package com.example.testinginsights.country;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.hamcrest.Matchers.containsString;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RandomPortWebTestClientCountryTest {

    private WebTestClient webTestClient = WebTestClient
            .bindToServer()
            .build();

    @LocalServerPort
    private int port;

    @Test
    public void exampleTest() {
        this.webTestClient.get().uri("http://localhost:" + port + "/countries/SG")
                .exchange()
                .expectStatus().isOk()
                .expectBody(String.class).value(containsString("Singapore"));
    }


}
