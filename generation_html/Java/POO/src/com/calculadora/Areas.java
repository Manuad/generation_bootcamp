package com.calculadora;

import java.util.Scanner;

public class Areas {
    Scanner sc = new Scanner(System.in);

    public void mensaje() {
        System.out.println("Vamos a calcular areas");

    }

    public float areaCuadrado(float lado) {
        System.out.println("Ingresa el lado del cuadrado");
        lado = sc.nextFloat();
        return lado * lado;
    }

    public float areaTriangulo(float base, float altura) {
        return base * altura / 2;
    }


}
