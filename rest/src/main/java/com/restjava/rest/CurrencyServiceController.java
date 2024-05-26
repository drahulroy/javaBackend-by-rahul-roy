package com.restjava.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST controller to handle requests related to currency service configuration.
 */
@RestController
public class CurrencyServiceController {

    // Autowiring the CurrencyServiceConfiguration to inject the configuration properties
    @Autowired
    private CurrencyServiceConfiguration configuration;

    /**
     * Endpoint to retrieve the currency service configuration.
     *
     * @return CurrencyServiceConfiguration containing the configuration properties.
     */
    @RequestMapping("/currency-configuration")
    public CurrencyServiceConfiguration retrieveCurrencyConfiguration() {
        return configuration;
    }
}
