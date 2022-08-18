package com.tema3.parte2;

// Ejercicio TEMA 3 - Segunda Parte
// * Crear una clase coche *
// * Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene *
// * Una función que incremente el número de puertas que tiene el coche *
// * Crear un objeto miCoche en el main y añadirle una puerta *
// * Mostrar el número de puertas que tiene el objeto *

public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.incrementarPuerta();
        System.out.println(miCoche.puerta);
    }
}

class Coche {
    public int puerta = 3;

    public void incrementarPuerta() {
        this.puerta++;
    }
}
