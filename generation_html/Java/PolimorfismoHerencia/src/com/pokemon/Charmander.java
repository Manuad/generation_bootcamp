package com.pokemon;

public class Charmander extends Pokemon implements TipoFuego, TipoVolador {

    public Charmander(int id, String nombre, int edad, int nivel, boolean evolucion) {
        super(id, nombre, edad, nivel, evolucion);
    }

    public void lanzaLlamas(){
        System.out.println("El pokemon " + super.getNombre() +" usa lanza de llamas");
    }

    public void araniar(){
        System.out.println("El pokemon " + super.getNombre() +" usa arania");
    }

    public void volar(){
        System.out.println("El pokemon " + super.getNombre() +" usa volar");
    }

    public void atacar(){
        System.out.println("El pokemon " + super.getNombre() +" usa ataque");
    }

    @Override
    public void saludar(String mensaje) {
        System.out.println("El pokemon " + super.getNombre() + " que es " + this.getClass() + " Tipo Fuego dice " + mensaje);
    }
}
