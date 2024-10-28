package com.rrojase.tataretotecnico.infrastructure.rest.client;

import com.rrojase.tataretotecnico.infrastructure.rest.config.ExchangeRateFeignClientConfig;
import com.rrojase.tataretotecnico.infrastructure.rest.dto.ExchangeRateResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "exchange-rate-service", url = "${external.exchangerate.api.base-url}", configuration = ExchangeRateFeignClientConfig.class)
public interface ExchangeRateFeignClient {
    @GetMapping(value = "/{currency}", consumes = MediaType.APPLICATION_JSON_VALUE)
    ExchangeRateResponseDTO getExchangeRateByCurrency(@PathVariable("currency") String currency);
}
