package com.tema3.parte1;

// Ejercicio TEMA 3 - Primera Parte
// * Crear una función con tres parámetros que sean números que se suman entre sí *
// * Llamar a la función en el main y darle valores *

public class Main {
    public static void main(String[] args) {
        int resultado;
        resultado = Suma(2,5,8);
        System.out.println(resultado);
    }

    public static int Suma(int a, int b, int c) {
        return a + b + c;
    }
}