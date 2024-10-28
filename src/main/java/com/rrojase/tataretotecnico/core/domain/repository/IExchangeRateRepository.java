package com.rrojase.tataretotecnico.core.domain.repository;

import com.rrojase.tataretotecnico.core.domain.models.ExchangeRate;

import java.util.List;

public interface IExchangeRateRepository {
    List<ExchangeRate> findAll();
    ExchangeRate save(ExchangeRate exchangeRate);
}
