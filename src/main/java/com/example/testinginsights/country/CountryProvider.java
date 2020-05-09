package com.example.testinginsights.country;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryProvider {

    List<String> provideCountries() {
        return List.of("Singapore", "Switzerland");
    }
}