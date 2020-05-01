package com.example.testinginsights.country;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.hamcrest.Matchers.containsString;

@SpringBootTest
@AutoConfigureWebTestClient
public class WebTestClientCountryTest {

    private WebTestClient webTestClient = WebTestClient
            .bindToController(new CountryController()).build();

    @Test
    public void exampleTest() {
        this.webTestClient.get().uri("/countries")
                .exchange()
                .expectStatus().isOk()
                .expectBody(String.class).value(containsString("Singapore"));
    }


}
