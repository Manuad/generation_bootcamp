package com.pokemon;

public class TipoPlanta extends Pokemon {

    int numeroHojas;

    public TipoPlanta(int id, String nombre, int edad, int nivel, boolean evolucion,  int numeroHojas) {
        //Los primeros parametros son los mismos que en el constructor de la clase padre y el ultimo es el nuevo parametro de la subclase
        super(id, nombre, edad, nivel, evolucion); //Llamo al constructor de la clase padre
        this.numeroHojas = numeroHojas;
    }

    public void envenenar() {
        System.out.println("El pokemon " + super.getNombre() +" envenena");
    }

    public void paralizar() {
        System.out.println("El pokemon " + super.getNombre() +" paraliza");
    }

    /**
     * Anulación de métodos heredados
     * @return String
     */
    public void atacar() {
        System.out.println("El pokemon " + super.getNombre() + " que es " + this.getClass() + " Tipo Planta usa ataque");
    }

    @Override
    public void saludar(String mensaje) {
        System.out.println("El pokemon " + super.getNombre() + " que es " + this.getClass() + " Tipo Planta dice " + mensaje);
    }

}
