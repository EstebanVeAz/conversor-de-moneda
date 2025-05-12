package com.eva.conversor.service;

import com.eva.conversor.model.ExchangeRateResponse;
import com.google.gson.Gson;

public class ConversionService {
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/8dc5ba3334d3b6719685f3b5/latest/USD";

    public ExchangeRateResponse getExchangeRates() throws Exception {
        String json = getExchangeRatesJson();
        Gson gson = new Gson();
        return gson.fromJson(json, ExchangeRateResponse.class);
    }

    private String getExchangeRatesJson() throws Exception {
        var client = java.net.http.HttpClient.newHttpClient();
        var request = java.net.http.HttpRequest.newBuilder()
                .uri(java.net.URI.create(API_URL))
                .build();

        var response = client.send(request, java.net.http.HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

    public double convertCurrency(String fromCurrency, String toCurrency, double amount) throws Exception {
        ExchangeRateResponse data = getExchangeRates();
        double fromRate = data.getConversion_rates().get(fromCurrency);
        double toRate = data.getConversion_rates().get(toCurrency);
        return amount / fromRate * toRate;
    }
}