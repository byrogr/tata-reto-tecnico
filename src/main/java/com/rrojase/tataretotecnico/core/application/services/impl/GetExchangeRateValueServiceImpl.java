package com.rrojase.tataretotecnico.core.application.services.impl;

import com.rrojase.tataretotecnico.core.application.services.IGetExchangeRateValueService;
import com.rrojase.tataretotecnico.core.domain.services.IGetExchangeRateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class GetExchangeRateValueServiceImpl implements IGetExchangeRateValueService {

    private final IGetExchangeRateService getExchangeRateService;

    @Override
    public double getExchangeRateValue(String originCurrency, String destinationCurrency) {
        return getExchangeRateService.getExchangeRateByCurrency(originCurrency, destinationCurrency);
    }
}
