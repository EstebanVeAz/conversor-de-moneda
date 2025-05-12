package com.eva.conversor;

import com.eva.conversor.service.ConversionService;

import java.util.Scanner;

public class ConversorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversionService service = new ConversionService();

        String[] monedasDisponibles = {"USD", "ARS", "BOB", "BRL", "CLP", "COP", "EUR", "MXN", "GBP", "JPY"};

        System.out.println("=== Bienvenido/a al Conversor de Moneda ===");

        boolean continuar = true;

        while (continuar) {
            System.out.println("\nMonedas disponibles:");
            for (String moneda : monedasDisponibles) {
                System.out.print(moneda + "  ");
            }
            System.out.println();

            System.out.print("Ingrese la moneda de origen: ");
            String from = scanner.nextLine().toUpperCase();

            System.out.print("Ingrese la moneda de destino: ");
            String to = scanner.nextLine().toUpperCase();

            System.out.print("Ingrese el valor que desea convertir: ");
            double amount;
            try {
                amount = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Valor no válido. Intente de nuevo.");
                continue;
            }
            try {
                double result = service.convertCurrency(from, to, amount);
                System.out.printf("Resultado: %.2f %s = %.2f %s%n", amount, from, result, to);
            } catch (Exception e) {
                System.out.println("Error al realizar la conversión: " + e.getMessage());
            }

            System.out.print("\n¿Desea realizar otra conversión? (s/n): ");
            String respuesta = scanner.nextLine().toLowerCase();
            if (!respuesta.equals("s")) {
                continuar = false;
            }
        }

        System.out.println("Gracias por usar el conversor de moneda. ¡Hasta luego!");
        scanner.close();
    }
}