package com.rrojase.tataretotecnico.core.application.services;

public interface IGetExchangeRateValueService {
    double getExchangeRateValue(String originCurrency, String destinationCurrency);
}
