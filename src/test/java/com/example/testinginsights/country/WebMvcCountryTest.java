package com.example.testinginsights.country;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;

import static java.util.Collections.*;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(CountryController.class)
public class WebMvcCountryTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private CountryProvider countryProvider;

    @Test
    public void exampleTest() throws Exception {
        Mockito.when(countryProvider.provideCountries()).thenReturn(singletonList("testdata"));

        this.mvc.perform(get("/countries"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("testdata")));
    }


}
