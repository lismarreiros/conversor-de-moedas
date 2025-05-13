package br.com.conversordemoedas.app;

import java.util.Scanner;

public class MenuHandler {
        Scanner read = new Scanner(System.in);
        int choice = 0;

    public void showMenu() {
        while (choice != (7)) {
            System.out.println("*******************************************************************");
            System.out.println("");
            System.out.println("1) Dólar =>> Peso Argentino");
            System.out.println("2) Peso Argentino =>> Dólar");
            System.out.println("3) Dólar =>> Real Brasileiro");
            System.out.println("4) Real Brasileiro =>> Dólar");
            System.out.println("5) Dólar ==> Peso Colombiano");
            System.out.println("6) Peso Colombiano ==> Dólar");
            System.out.println("7) Sair");
            System.out.println("Escolha um opção válida:");
            choice = read.nextInt();
            System.out.println("*******************************************************************");
        }
    }

    public void getChoice() {
        switch (choice) {
            case 1:
                // ação 1
                break;
            case 2:
                // ação 2
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                System.out.println("Escolha um opção válida:");
        }

    }
}
