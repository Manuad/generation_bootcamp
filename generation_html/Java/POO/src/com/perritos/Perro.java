package com.perritos;

public class Perro {
    /**
     * Atributos de la clase Perro
     */

    int edad;
    String nombre;
    String raza;
    String tamanio;

    /**
     * Método constructor de la clase Perro
     */
    public Perro(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Métodos de la clase Perro
     */
    public void ladrar() {
        System.out.println("El perro " + nombre + " dice: Guau Guau!");
    }

    public void comer() {
        System.out.println("Comiendo");
    }

    public void dormir() {
        System.out.println("Durmiendo");
    }

    public void correr() {
        System.out.println("Corriendo");
    }

    public int edadPerruna() {
        return edad * 7;
    }

    /**
     * Método static de la clase Perro
     * Nos permite acceder a los atributos de la clase Perro sin necesidad de crear un objeto de la clase Perro
     */
    public static void mensaje(String nombre){
        System.out.println("Hola soy un mensaje estatico " + nombre);
    }
}
