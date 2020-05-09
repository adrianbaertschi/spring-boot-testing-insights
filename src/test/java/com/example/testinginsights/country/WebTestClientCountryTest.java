package com.example.testinginsights.country;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.hamcrest.Matchers.containsString;

@SpringBootTest
@AutoConfigureWebTestClient
public class WebTestClientCountryTest {

    private final WebTestClient webTestClient = WebTestClient
            .bindToController(new CountryController(new CountryProvider())).build();

    @Test
    public void exampleTest() {
        this.webTestClient.get().uri("/countries/SG")
                .exchange()
                .expectStatus().isOk()
                .expectBody(String.class).value(containsString("Singapore"));
    }


}
