package com.rrojase.tataretotecnico.infrastructure.rest.dto;

import lombok.Getter;

import java.util.HashMap;

@Getter
public class ExchangeRateResponseDTO {
    private String result;
    private String provider;
    private String documentation;
    private String terms_of_use;
    private String time_last_update_unix;
    private String time_last_update_utc;
    private String time_next_update_unix;
    private String time_next_update_utc;
    private short time_eol_unix;
    private String base_code;
    private HashMap<String, Double> rates;
}
