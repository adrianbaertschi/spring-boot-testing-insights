package com.example.testinginsights.country;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CountryProviderTest {

    @Test
    void findByIsoCodeCH_return_Switzerland() {
        String country = new CountryProvider().findByIsoCode("CH");
        assertThat(country).isEqualTo("Switzerland");
    }
}