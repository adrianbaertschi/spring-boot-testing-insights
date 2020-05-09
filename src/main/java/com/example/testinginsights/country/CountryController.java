package com.example.testinginsights.country;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    private final CountryProvider countryProvider;

    public CountryController(CountryProvider countryProvider) {
        this.countryProvider = countryProvider;
    }

    @GetMapping("/countries/{isoCode}")
    public String countryByIsoCode(@PathVariable String isoCode) {
        return countryProvider.findByIsoCode(isoCode);
    }
}