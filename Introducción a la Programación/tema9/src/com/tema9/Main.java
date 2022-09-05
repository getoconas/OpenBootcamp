package com.tema9;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        cliente.setEdad(22);
        cliente.setNombre("Martin");
        cliente.setTelefono(123456789);
        cliente.setCredito(1500.8);

        System.out.println("Nombre: " + cliente.getNombre() + " Edad: " + cliente.getEdad());
        System.out.println("Telefono: " + cliente.getTelefono() + " Credito: " + cliente.getCredito());

        trabajador.setEdad(33);
        trabajador.setNombre("Jose");
        trabajador.setTelefono(22445566);
        trabajador.setSalario(4500.22);

        System.out.println("Nombre: " + trabajador.getNombre() + " Edad: " + trabajador.getEdad());
        System.out.println("Telefono: " + trabajador.getTelefono() + " Salario: " + trabajador.getSalario());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona {
    private double credito;

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona {
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
