package com.rrojase.tataretotecnico.api.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ExchangeRateDTO {
    private double amount;
    private double amountExchangeRate;
    private String originCurrency;
    private String destinationCurrency;
    private double rate;
}
