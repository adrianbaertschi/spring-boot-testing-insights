package com.example.testinginsights.country;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

class CountryServiceUnitTest {

    @Test
    void mockitoSimpleInlined() {
        CountryRepository countryRepository = Mockito.mock(CountryRepository.class);
        when(countryRepository.findByIsoCode(anyString())).thenReturn("testdata");

        String result = new CountryService(countryRepository).findByIsoCode("CH");

        assertThat(result).isEqualTo("testdata");
        verify(countryRepository, times(1)).findByIsoCode("CH");
    }

}