package com.calculadora;

public class Main {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(10, 20);
        calculadora.sumar();
        Calculadora calculadora2 = new Calculadora(1,2,3);
        calculadora2.sumar(1);
        Calculadora calculadora3 = new Calculadora(1,2, 4, "Calculadora 3");
        calculadora3.sumar();
    }
}
