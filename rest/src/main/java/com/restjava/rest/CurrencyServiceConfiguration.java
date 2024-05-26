package com.restjava.rest;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Configuration class to bind properties with prefix "currency-service".
 */
@ConfigurationProperties(prefix = "currency-service")
@Component
public class CurrencyServiceConfiguration {
    private String url;
    private String username;
    private String key;

    // Getter and setter for URL
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    // Getter and setter for username
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Getter and setter for key
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
