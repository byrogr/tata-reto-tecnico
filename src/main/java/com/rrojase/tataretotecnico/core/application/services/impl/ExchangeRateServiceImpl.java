package com.rrojase.tataretotecnico.core.application.services.impl;

import com.rrojase.tataretotecnico.api.model.ExchangeRateRequestDTO;
import com.rrojase.tataretotecnico.core.application.services.IExchangeRateService;
import com.rrojase.tataretotecnico.core.domain.models.Currency;
import com.rrojase.tataretotecnico.core.domain.models.ExchangeRate;
import com.rrojase.tataretotecnico.core.domain.repository.IExchangeRateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExchangeRateServiceImpl implements IExchangeRateService {

    private final IExchangeRateRepository exchangeRateRepository;

    @Override
    public List<ExchangeRate> getAllExchangeRate() {
        return exchangeRateRepository.findAll();
    }

    @Override
    public ExchangeRate createExchangeRate(ExchangeRateRequestDTO request, double rateValue) {
        ExchangeRate exchangeRate = ExchangeRate.builder()
                .amount(request.getAmount())
                .amountExchangeRate(request.getAmount() * rateValue)
                .originCurrency(Currency.valueOf(request.getOriginCurrency()))
                .destinationCurrency(Currency.valueOf(request.getDestinationCurrency()))
                .rate(rateValue)
                .build();
        return exchangeRateRepository.save(exchangeRate);
    }
}
