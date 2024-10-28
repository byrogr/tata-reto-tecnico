package com.rrojase.tataretotecnico.api.controllers;

import com.rrojase.tataretotecnico.api.Assembler;
import com.rrojase.tataretotecnico.api.model.ExchangeRateDTO;
import com.rrojase.tataretotecnico.core.application.services.IExchangeRateService;
import com.rrojase.tataretotecnico.core.application.services.IGetExchangeRateValueService;
import com.rrojase.tataretotecnico.api.model.ExchangeRateRequestDTO;
import com.rrojase.tataretotecnico.core.domain.models.ExchangeRate;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ExchangeRateController {

    private final IGetExchangeRateValueService getExchangeRateValueService;
    private final IExchangeRateService exchangeRateService;

    @GetMapping("/exchangeRates")
    public ResponseEntity<List<ExchangeRateDTO>> getAllExchangeRates() {
        List<ExchangeRateDTO> exchangeRates = exchangeRateService.getAllExchangeRate().stream()
                .map(Assembler::toExchangeRateResponseDTO)
                .toList();
        return ResponseEntity.ok(exchangeRates);
    }

    @PostMapping("/exchangeRates")
    public ResponseEntity<ExchangeRateDTO> saveExchangeRate(@RequestBody ExchangeRateRequestDTO request) {
        double rateValue = getExchangeRateValueService.getExchangeRateValue(
                request.getOriginCurrency(),
                request.getDestinationCurrency()
        );
        ExchangeRate response = exchangeRateService.createExchangeRate(request, rateValue);
        return ResponseEntity.ok(Assembler.toExchangeRateResponseDTO(response));
    }
}
