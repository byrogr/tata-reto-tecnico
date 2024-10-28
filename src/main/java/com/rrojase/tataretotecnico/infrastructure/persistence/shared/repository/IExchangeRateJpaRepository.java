package com.rrojase.tataretotecnico.infrastructure.persistence.shared.repository;

import com.rrojase.tataretotecnico.infrastructure.persistence.shared.entities.ExchangeRateEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IExchangeRateJpaRepository extends JpaRepository<ExchangeRateEntity, Integer> {
}
