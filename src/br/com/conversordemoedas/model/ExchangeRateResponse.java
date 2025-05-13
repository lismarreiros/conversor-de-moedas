package br.com.conversordemoedas.model;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public record ExchangeRateResponse(@SerializedName("base_code") String baseCode, @SerializedName("conversion_rates") Map conversionRate) {
}
