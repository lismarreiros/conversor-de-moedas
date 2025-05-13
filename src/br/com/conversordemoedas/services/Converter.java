package br.com.conversordemoedas.services;

public class Converter {
    public double convertCurrency(double quantity, double quote) {
       return  quantity * quote;
    }
}
