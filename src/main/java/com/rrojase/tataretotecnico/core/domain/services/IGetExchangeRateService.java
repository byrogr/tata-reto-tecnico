package com.rrojase.tataretotecnico.core.domain.services;

public interface IGetExchangeRateService {
    double getExchangeRateByCurrency(String originCurrency, String destinationCurrency);
}
