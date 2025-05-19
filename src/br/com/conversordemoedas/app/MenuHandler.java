package br.com.conversordemoedas.app;

import br.com.conversordemoedas.client.CurrencyApiClient;
import br.com.conversordemoedas.services.CurrencyCalculator;

import java.util.Scanner;

public class MenuHandler {
        Scanner read = new Scanner(System.in);
        int choice = 0;
        String outputValue;
        double quantity;
        CurrencyCalculator calculator = new CurrencyCalculator();
        double quote;
        double result;

    public void showMenu() {
        while (true) {
            System.out.println("*********************************************");
            System.out.println("1) Dólar =>> Peso Argentino");
            System.out.println("2) Peso Argentino =>> Dólar");
            System.out.println("3) Dólar =>> Real Brasileiro");
            System.out.println("4) Real Brasileiro =>> Dólar");
            System.out.println("5) Dólar =>> Peso Colombiano");
            System.out.println("6) Peso Colombiano =>> Dólar");
            System.out.println("7) Sair");
            System.out.println("Escolha uma opção válida:");

            try {
                choice = Integer.parseInt(read.nextLine());

                if (choice < 1 || choice > 7) {
                    System.out.println("Opção inválida. Por favor, escolha entre 1 e 7.\n");
                    continue;
                }

                if (choice == 7) {
                    System.out.println("Saindo do programa...");
                    break;
                }

                double input;
                while (true) {
                    System.out.println("Digite o valor que deseja converter:");
                    try {
                      String inputValue = read.nextLine();
                      input = Double.parseDouble(inputValue);
                        if (input < 0) {
                            System.out.println("Valor não pode ser negativo. Tente novamente.");
                        } else {
                            quantity = input;
                            break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Entrada inválida. Digite um número válido (ex: 100.50)");
                    }
                }

                getChoice();
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número válido.\n");
            }

        }
    }

    public void getChoice() {
        switch (choice) {
            case 1:
                CurrencyApiClient clientOptionOne = new CurrencyApiClient("USD", "ARS");
                clientOptionOne.connection();
                quote = clientOptionOne.getQuote();
                result = calculator.convert(quantity, quote);
                outputValue = "Valor " + quantity + " [USD] corresponde ao valor final de =>>> " + result + " [ARS]";
                System.out.println(outputValue);
                break;
            case 2:
                CurrencyApiClient clientOptionTwo = new CurrencyApiClient("ARS", "USD");
                clientOptionTwo.connection();
                quote = clientOptionTwo.getQuote();
                result = calculator.convert(quantity, quote);
                outputValue = "Valor " + quantity + " [ARS] corresponde ao valor final de =>>> " + result + " [USD]";
                System.out.println(outputValue);
                break;
            case 3:
                CurrencyApiClient clientOptionThree = new CurrencyApiClient("USD", "BRL");
                clientOptionThree.connection();
                quote = clientOptionThree.getQuote();
                result = calculator.convert(quantity, quote);
                outputValue = "Valor " + quantity + " [USD] corresponde ao valor final de =>>> " + result + " [BRL]";
                System.out.println(outputValue);
                break;
            case 4:
                CurrencyApiClient clientOptionFour = new CurrencyApiClient("BRL", "USD");
                clientOptionFour.connection();
                quote = clientOptionFour.getQuote();
                result = calculator.convert(quantity, quote);
                outputValue = "Valor " + quantity + " [BRL] corresponde ao valor final de =>>> " + result + " [USD]";
                System.out.println(outputValue);
                break;
            case 5:
                CurrencyApiClient clientOptionFive = new CurrencyApiClient("USD", "COP");
                clientOptionFive.connection();
                quote = clientOptionFive.getQuote();
                result = calculator.convert(quantity, quote);
                outputValue = "Valor " + quantity + " [USD] corresponde ao valor final de =>>> " + result + " [COP]";
                System.out.println(outputValue);
                break;
            case 6:
                CurrencyApiClient clientOptionSix = new CurrencyApiClient("COP", "USD");
                clientOptionSix.connection();
                quote = clientOptionSix.getQuote();
                result = calculator.convert(quantity, quote);
                outputValue = "Valor " + quantity + " [COP] corresponde ao valor final de =>>> " + result + " [USD]";
                System.out.println(outputValue);
                break;
            default:
                System.out.println("Escolha um opção válida:");
        }

    }
}
