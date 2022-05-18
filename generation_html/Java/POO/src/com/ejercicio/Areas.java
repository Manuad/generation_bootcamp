package com.ejercicio;

public class Areas {

    public float areaTriangulo(float a, float b) {
        float area = (a * b) / 2;
        String mensaje = "El area del triangulo es: ";
        return area;
    }

    public float areaCuadrado(float a) {

        return (float) Math.pow(a, 2);
    }

    public float areaCirculo(float r) {
        return (float) (Math.PI * Math.pow(r, 2));
    }
}
