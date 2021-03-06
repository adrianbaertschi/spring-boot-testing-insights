package com.example.testinginsights.country;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class CountryController {

    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/countries/{isoCode}")
    public String countryByIsoCode(@PathVariable String isoCode) {
        if (isoCode == null || isoCode.length() != 2) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "isocode must me 2 digits");
        }
        return countryService.findByIsoCode(isoCode);
    }
}