package com.tema4;

// Ejercicio TEMA 4

public class Main {
    public static void main(String[] args) {

        int numeroIf = 3, numeroWhile = 1;
        var estacion = "invierno";

        if (numeroIf > 0) {
            System.out.println("El numero es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es cero");
        }

        System.out.println("--------------------");

        while (numeroWhile < 3) {
            System.out.println("Numero " + numeroWhile);
            numeroWhile++;
        }

        System.out.println("--------------------");

        do {
            System.out.println("Numero " + numeroWhile);
            numeroWhile++;
        } while (numeroWhile < 3);

        System.out.println("--------------------");

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("Numero " + numeroFor);
        }

        System.out.println("--------------------");

        switch (estacion) {
            case "verano":
                System.out.println("Es verano");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            case "primavera":
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("NO es una estacion");
                break;
        }

    }
}