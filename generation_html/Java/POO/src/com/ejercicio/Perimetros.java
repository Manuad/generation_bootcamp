package com.ejercicio;

public class Perimetros {

    public float perimetroTriangulo(float a, float b , float c) {
        return a + b + c;
    }

    public float perimetroCuadrado(float a) {
        return a * 4;
    }

    public float perimetroCirculo(float d) {
        return (float) (Math.PI * d * 2);
    }
}
