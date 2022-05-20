package com.generation.model;

public class PruebaPerro {

    public static void main(String[] args) {
        Perro pelusa = new Perro("Pelusa", "French", "Grande", 5, "Blanco");
        System.out.println(pelusa);

        Perro solovino = new Perro("Solovino", "Labrador", "Mediano", 2, "Blanco");
        System.out.println(solovino);

        pelusa.setHumano("Juan");
        System.out.println(pelusa);

        solovino.setHumano("Pedro");
        System.out.println(solovino);

        System.out.println(Perro.buscarHumano(1));
        System.out.println(Perro.buscarHumano(2));
    }
}
