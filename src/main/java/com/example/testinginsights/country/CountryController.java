package com.example.testinginsights.country;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    private final CountryProvider countryProvider;

    public CountryController(CountryProvider countryProvider) {
        this.countryProvider = countryProvider;
    }

    @GetMapping("/countries")
    public List<String> countries() {
        return countryProvider.provideCountries();
    }
}