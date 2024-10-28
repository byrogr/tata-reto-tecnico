package com.rrojase.tataretotecnico.infrastructure.rest.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExchangeRateFeignClientConfig {

    @Bean
    Logger.Level feignLoggerLevel() { return Logger.Level.FULL; }
}
