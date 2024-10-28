package com.rrojase.tataretotecnico.infrastructure.persistence.shared.entities;

import com.rrojase.tataretotecnico.core.domain.models.Currency;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "exchange_rate")
public class ExchangeRateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false, columnDefinition = "decimal(6,2)")
    private double amount;

    @Column(nullable = false, columnDefinition = "decimal(6,2)")
    private double amountExchangeRate;

    @Column(nullable = false, length = 3)
    private String originCurrency;

    @Column(nullable = false, length = 3)
    private String destinationCurrency;

    @Column(nullable = false, columnDefinition = "decimal(6,2)")
    private double exchangeRate;
}
