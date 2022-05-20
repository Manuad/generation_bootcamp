package com.generation.arreglos;

import java.util.Arrays;
import java.util.Objects;

public class Arreglos {

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            int[] arreglo = new int[5];
            arreglo[0] = 1;
            arreglo[1] = 2;
            arreglo[2] = 3;
            arreglo[3] = 4;
            arreglo[4] = 5;

            for (int i = 0; i < arreglo.length; i++) {
                System.out.println(arreglo[i]);
            }

            int[] arreglo2 = {1, 2, 3, 4, 5};

            for (int i = 0; i < arreglo2.length; i++) {
                System.out.println(arreglo2[i]);
            }

            int[] arreglo3 = new int[5];
            arreglo3[0] = 1;
            arreglo3[1] = 2;
            arreglo3[2] = 3;
            arreglo3[3] = 4;
            arreglo3[4] = 5;

            for (int i = 0; i < arreglo3.length; i++) {
                System.out.println(arreglo3[i]);
            }

            int[] arreglo4 = {1, 2, 3, 4, 5};

            for (int i = 0; i < arreglo4.length; i++) {
                System.out.println(arreglo4[i]);
            }

            int[] arreglo5 = new int[5];
            arreglo5[0] = 1;
            arreglo5[1] = 2;
            arreglo5[2] = 3;
            arreglo5[3] = 4;
            arreglo5[4] = 5;

            /**
             * forEach sirve para recorrer un arreglo
             */
            int count = 0;
            for (int elemento: arreglo5) {
                count++;
                System.out.println("Elemento " + count + ": " + elemento);
            }

            //Objetos de la calse Persona
            Persona persona1 = new Persona("Juan", 23);
            Persona persona2 = new Persona("Pedro", 25);

            //Arreglo que guarda objetos
            //Object arrPersonas[] = {persona1, persona2};
            Persona arrPersonas[] = new Persona[3];

            arrPersonas[0] = persona1;
            arrPersonas[1] = persona2;
            arrPersonas[2] = new Persona("Juan", 23);

            System.out.println(Arrays.toString(arrPersonas));

            for(Persona elemento: arrPersonas) {
                System.out.println(elemento + " " + elemento);
            }

            //Arreglos literales
            int[] arreglo6 = {1, 2, 3, 4, 5};

            System.out.println(Arrays.toString(arreglo6));
        }
}
