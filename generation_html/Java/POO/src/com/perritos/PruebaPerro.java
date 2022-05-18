package com.perritos;

public class PruebaPerro {

    public static void main(String[] args) {
        // Instanciamos un perro
        Perro cookies = new Perro("Cookies", 3);
        cookies.ladrar();
        int edad = cookies.edadPerruna();
        System.out.println(edad);

        Perro max = new Perro("Max", 5);
        max.raza = "Pastor Aleman";
        max.tamanio = "Grande";
        max.ladrar();

        max.mensaje(max.nombre);
    }
}
