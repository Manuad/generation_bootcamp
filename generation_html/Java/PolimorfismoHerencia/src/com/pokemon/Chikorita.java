package com.pokemon;

public class Chikorita extends TipoPlanta{

    private int numCuernitos;

    public Chikorita(int id, String nombre, int edad, int nivel, boolean evolucion, int numeroHojas, int numCuernitos) {
        super(id, nombre, edad, nivel, evolucion, numeroHojas);
        this.numCuernitos = numCuernitos;
    }

    public void latigo() {
        System.out.println("El pokemon " + super.getNombre() +" usa latigo");
    }



}
