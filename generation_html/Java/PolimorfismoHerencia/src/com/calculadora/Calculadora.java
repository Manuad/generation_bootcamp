package com.calculadora;

public class Calculadora {

    private int a, b, c, resultado;
    private String nombre;

    public Calculadora(int a, int b) {
        this.a = a;
        this.b = b;
    }

    //
    public Calculadora(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Calculadora(int a, int b, int c, String nombre) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.nombre = nombre;
    }

    public void sumar() {
        resultado = this.a + this.b;
        System.out.println(resultado);
    }

    public void sumar(int c){
        System.out.println("Segundo método");
    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
}
