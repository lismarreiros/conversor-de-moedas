package br.com.conversordemoedas.client;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class CurrencyApiClient {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String search = "";
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        String address = "https://v6.exchangerate-api.com/v6/4eedbc76f15cf16e98ab04d9/latest/" + search;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(address))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            System.out.println(json);
        } catch (IllegalArgumentException | IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
