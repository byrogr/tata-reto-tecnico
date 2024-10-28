package com.rrojase.tataretotecnico.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ExchangeRateRequestDTO {
    private double amount;
    private String originCurrency;
    private String destinationCurrency;
}
