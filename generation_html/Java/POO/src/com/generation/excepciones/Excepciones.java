package com.generation.excepciones;

import java.util.Scanner;

public class Excepciones {

    public static void main(String[] args) {
        System.out.println("Inicio del programa");
        System.out.println("Ingrese un numero");
        try {
            Scanner sc = new Scanner(System.in);
            int numero = sc.nextInt();
            Math.divideExact(numero, 0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
