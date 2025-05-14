package br.com.conversordemoedas.services;

import br.com.conversordemoedas.model.ExchangeRateResponse;

import java.util.Map;

public class CurrencyConversion {
    private String code;
    private Map<String, Double> conversionRates;

    public CurrencyConversion(ExchangeRateResponse currencySearch) {
        this.code = currencySearch.baseCode();
        this.conversionRates = currencySearch.conversionRate();
    }

    public String getCode() {
        return code;
    }

    public Map<String, Double> getConversionRates() {
        return conversionRates;
    }

    public double getConversionRate(String base_code) {
        double rate = conversionRates.get(base_code);
        return rate;
    }
}
