package com.generation.model;

import java.util.HashMap;
import java.util.Map;

public class Perro {

    //Atributos
    private int id;
    private static int contador = (int) (Math.random() * 100);
    private String nombre;
    private String raza;
    private String tamanio;
    private int edad;
    private String color;
    private static Map<Integer, String>humano = new HashMap<Integer, String>();

    //Constructor
    public Perro(String nombre, String raza, String tamanio, int edad, String color) {
        this.id = ++Perro.contador;
        this.nombre = nombre;
        this.raza = raza;
        this.tamanio = tamanio;
        this.edad = edad;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Perro.contador = contador;
    }

    public void setHumano(String value) {
        Perro.humano.put(this.id, value);
    }

    //Método toString
    @Override
    public String toString() {
        return "Perro{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", tamanio='" + tamanio + '\'' +
                ", edad=" + edad +
                ", color='" + color + '\'' +
                '}';
    }

    //Métodos
    public void comer() {
        System.out.println(this.nombre + " está comiendo");//se usa el this.nombre para acceder al atributo nombre del objeto con contexto de la clase
    }

    public void ladrar() {
        System.out.println(this.nombre + " está ladrando");
    }

    public void jugar() {
        System.out.println(this.nombre + " está jugando");
    }

    public void dormir() {
        System.out.println(this.nombre + " está durmiendo");
    }

    public void correr() {
        System.out.println(this.nombre + " está corriendo");
    }

    public static String buscarHumano(Integer key) {
        return "El nombre de este humano es: " + humano.get(key);
    }
    /*
    public void comer(String comida) {
        System.out.println(this.nombre + " está comiendo " + comida);
    }
     */

    //Getters y Setters


}
