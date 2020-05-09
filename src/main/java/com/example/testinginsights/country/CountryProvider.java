package com.example.testinginsights.country;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CountryProvider {


    private final Map<String, String> countries = Map.of(
            "CH", "Switzerland",
            "SG", "Singapore");

    String findByIsoCode(String isoCode) {
        return countries.get(isoCode);
    }
}