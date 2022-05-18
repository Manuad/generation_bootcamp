package com.calculadora;

import java.util.Scanner;

public class PruebaCalculadora {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        /**
         * System.out.println("Vamos a calcular");
         *         int a = 10;
         *
         *
         *         Calculadora calculadora = new Calculadora();
         *         System.out.println("Introduce el primer numero");
         *         System.out.println(calculadora.suma(a, sc.nextInt()) + " es el resultado");
         *
         *         float suma = calculadora.suma(a, sc.nextInt());
         *         System.out.println(suma + " es el resultado");
         *
         *         float sumaM = calculadora.sumaM(sc.nextFloat(), sc.nextFloat());
         *         System.out.println(sumaM + " es el resultado");
         */


        Areas areas = new Areas();
        areas.mensaje();
        float cuadrado = (float) areas.areaCuadrado(45);
        System.out.println("El area del cuadrado es: " + cuadrado);
    }

}
