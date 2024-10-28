package com.rrojase.tataretotecnico.api;

import com.rrojase.tataretotecnico.api.model.ExchangeRateDTO;
import com.rrojase.tataretotecnico.core.domain.models.ExchangeRate;

public class Assembler {

    public static ExchangeRateDTO toExchangeRateResponseDTO(ExchangeRate exchangeRate) {
        return ExchangeRateDTO.builder()
                .amount(exchangeRate.getAmount())
                .amountExchangeRate(exchangeRate.getAmountExchangeRate())
                .originCurrency(exchangeRate.getOriginCurrency().getCurrencyCode())
                .destinationCurrency(exchangeRate.getDestinationCurrency().getCurrencyCode())
                .rate(exchangeRate.getRate())
                .build();
    }
}
