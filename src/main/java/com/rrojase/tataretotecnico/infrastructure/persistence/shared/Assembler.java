package com.rrojase.tataretotecnico.infrastructure.persistence.shared;

import com.rrojase.tataretotecnico.core.domain.models.Currency;
import com.rrojase.tataretotecnico.core.domain.models.ExchangeRate;
import com.rrojase.tataretotecnico.infrastructure.persistence.shared.entities.ExchangeRateEntity;

public class Assembler {

    public static ExchangeRate toExchangeRate (ExchangeRateEntity entity) {
        return ExchangeRate.builder()
                .amount(entity.getAmount())
                .amountExchangeRate(entity.getAmountExchangeRate())
                .originCurrency(Currency.valueOf(entity.getOriginCurrency()))
                .destinationCurrency(Currency.valueOf(entity.getDestinationCurrency()))
                .rate(entity.getExchangeRate())
                .build();
    }
}
