package com.rrojase.tataretotecnico.core.domain.models;

public enum Currency {
    PEN("PEN"),
    USD("USD"),
    EUR("EUR");

    private final String currencyCode;

    Currency(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }
}
