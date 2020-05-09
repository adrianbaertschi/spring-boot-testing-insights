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

class CountryServiceTestInline {

    @Test
    void mockitoSimpleInlined() {
        CountryRepository countryRepository = Mockito.mock(CountryRepository.class);
        when(countryRepository.findByIsoCode(anyString())).thenReturn("testdata");

        String result = new CountryService(countryRepository).findByIsoCode("CH");

        assertThat(result).isEqualTo("testdata");
        verify(countryRepository, times(1)).findByIsoCode("CH");
    }

}