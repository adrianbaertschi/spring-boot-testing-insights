package com.example.testinginsights.country;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class CountryServiceTestAnnotations {

    @Mock
    private CountryRepository countryRepository;

    @InjectMocks
    private CountryService countryService;

    @Test
    void mockitoAnnotations() {
        when(countryRepository.findByIsoCode(anyString())).thenReturn("testdata");

        String result = countryService.findByIsoCode("CH");

        assertThat(result).isEqualTo("testdata");
        verify(countryRepository, times(1)).findByIsoCode("CH");
    }
}