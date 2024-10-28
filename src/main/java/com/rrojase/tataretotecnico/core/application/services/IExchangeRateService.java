package com.rrojase.tataretotecnico.core.application.services;

import com.rrojase.tataretotecnico.api.model.ExchangeRateRequestDTO;
import com.rrojase.tataretotecnico.core.domain.models.ExchangeRate;

import java.util.List;

public interface IExchangeRateService {
    List<ExchangeRate> getAllExchangeRate();
    ExchangeRate createExchangeRate(ExchangeRateRequestDTO request, double rateValue);
}
