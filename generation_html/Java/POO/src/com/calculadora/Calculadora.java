package com.calculadora;

import java.util.Scanner;

public class Calculadora {

    /**
     * Método que no regresa nada; recibe dos números y realiza una operación aritmética
     * suma a los dos números
     * @param a
     * @param b
     */
    public void sumar(int a, int b){
        System.out.println("Voy a sumar " + a + " + " + b);
    }

    public String mensaje(){
        String mensaje = "Hola";
        return mensaje;
    }

    public double prueba() {
        return 1.0;
    }

    //Operaciones
    public float suma(float a, float b){
        return a + b;
    }

    public float sumaM(float a, float b){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el primer número");
        a = sc.nextFloat();
        System.out.println("Ingresa el segundo número");
        b = sc.nextFloat();
        return a + b;
    }

    public float resta(float a, float b){
        return a - b;
    }

    public float multiplicacion(float a, float b){
        return a * b;
    }

    public float division(float a, float b){
        try {
            float result = a / b;
            if (b == 0) {
                throw new ArithmeticException("No se puede dividir por cero");
            }
            return result;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        return a / b;
    }

    public int modulo(int a, int b){
        return a % b;
    }

    public float potencia(float a, float b){
        return (float) Math.pow(a, b);
    }

    public float raiz(float a){
        return (float) Math.sqrt(a);
    }
}
