package com.rrojase.tataretotecnico.infrastructure.rest.services;

import com.rrojase.tataretotecnico.core.domain.services.IGetExchangeRateService;
import com.rrojase.tataretotecnico.infrastructure.rest.client.ExchangeRateFeignClient;
import com.rrojase.tataretotecnico.infrastructure.rest.dto.ExchangeRateResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetExchangeRateServiceImpl implements IGetExchangeRateService {

    private final ExchangeRateFeignClient client;

    @Override
    public double getExchangeRateByCurrency(String originCurrency, String destinationCurrency) {
        ExchangeRateResponseDTO response = client.getExchangeRateByCurrency(originCurrency);
        return response.getResult().equals("success")
            ? response.getRates().get(destinationCurrency)
            : 0;
    }
}
