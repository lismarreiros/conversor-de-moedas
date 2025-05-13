package br.com.conversordemoedas.client;

import br.com.conversordemoedas.services.CurrencyConversion;
import br.com.conversordemoedas.model.ExchangeRateResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CurrencyApiClient {
    String baseCode;

    public CurrencyApiClient(String baseCode)  {
        this.baseCode = baseCode;
    }

    Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .create();

    public void connection() {
        String address = "https://v6.exchangerate-api.com/v6/4eedbc76f15cf16e98ab04d9/latest/" + baseCode;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(address))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            System.out.println(json);
            ExchangeRateResponse currencySearch = gson.fromJson(json, ExchangeRateResponse.class);
            CurrencyConversion myCurrency = new CurrencyConversion(currencySearch);
            System.out.println(myCurrency.getCode());
            System.out.println(myCurrency.getConversionRates());
        } catch (IllegalArgumentException | IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

}

