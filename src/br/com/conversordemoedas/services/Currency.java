package br.com.conversordemoedas.services;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class Currency {
    @SerializedName("base_code")
    private String code;
    @SerializedName("conversion_rates")
    private Map<String, Double> conversionRates;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Map<String, Double> getConversionRates() {
        return conversionRates;
    }

    public void setConversionRates(Map<String, Double> conversionRates) {
        this.conversionRates = conversionRates;
    }
}
