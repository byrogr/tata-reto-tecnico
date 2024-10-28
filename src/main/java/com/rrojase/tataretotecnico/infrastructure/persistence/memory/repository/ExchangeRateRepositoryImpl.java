package com.rrojase.tataretotecnico.infrastructure.persistence.memory.repository;

import com.rrojase.tataretotecnico.core.domain.models.ExchangeRate;
import com.rrojase.tataretotecnico.core.domain.repository.IExchangeRateRepository;
import com.rrojase.tataretotecnico.infrastructure.persistence.shared.Assembler;
import com.rrojase.tataretotecnico.infrastructure.persistence.shared.entities.ExchangeRateEntity;
import com.rrojase.tataretotecnico.infrastructure.persistence.shared.repository.IExchangeRateJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ExchangeRateRepositoryImpl implements IExchangeRateRepository {

    private final IExchangeRateJpaRepository repository;

    @Override
    public List<ExchangeRate> findAll() {
        return repository.findAll().stream()
                .map(Assembler::toExchangeRate)
                .toList();
    }

    @Override
    public ExchangeRate save(ExchangeRate exchangeRate) {
        ExchangeRateEntity entity = ExchangeRateEntity.builder()
                .amount(exchangeRate.getAmount())
                .amountExchangeRate(exchangeRate.getAmountExchangeRate())
                .originCurrency(exchangeRate.getOriginCurrency().getCurrencyCode())
                .destinationCurrency(exchangeRate.getDestinationCurrency().getCurrencyCode())
                .exchangeRate(exchangeRate.getRate())
                .build();
        return Assembler.toExchangeRate(repository.save(entity));
    }
}
