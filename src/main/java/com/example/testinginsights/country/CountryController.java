package com.example.testinginsights.country;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    @GetMapping("countries")
    public List<String> countries() {
        return List.of("Singapore", "Switzerland");
    }
}