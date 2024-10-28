package com.rrojase.tataretotecnico.core.domain.models;

import com.rrojase.tataretotecnico.core.domain.exceptions.CurrencyNotAllowedException;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExchangeRate {
    private double amount;
    private double amountExchangeRate;
    private Currency originCurrency;
    private Currency destinationCurrency;
    private double rate;

    public void checkIfCurrencyIsAllowed(String originCurrency, String destinationCurrency) {
        if (!(this.originCurrency.getCurrencyCode().equalsIgnoreCase(originCurrency)
                || this.destinationCurrency.getCurrencyCode().equalsIgnoreCase(destinationCurrency))
        ) {
            throw new CurrencyNotAllowedException();
        }
    }
}
