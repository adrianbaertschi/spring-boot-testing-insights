package com.example.testinginsights.country;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class CountryRepository {

    CountryRepository() {
        System.out.println("CountryRepository constructor called");
    }

    private final Map<String, String> countries = Map.of(
            "CH", "Switzerland",
            "SG", "Singapore");

    String findByIsoCode(String isoCode) {
        return countries.get(isoCode);
    }
}
