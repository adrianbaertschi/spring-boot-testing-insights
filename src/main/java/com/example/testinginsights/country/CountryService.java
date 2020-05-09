package com.example.testinginsights.country;

import org.springframework.stereotype.Service;

@Service
public class CountryService {


    private final CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    String findByIsoCode(String isoCode) {
        return countryRepository.findByIsoCode(isoCode);
    }
}