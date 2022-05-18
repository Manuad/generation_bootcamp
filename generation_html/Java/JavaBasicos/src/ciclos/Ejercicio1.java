package ciclos;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        /**
         * Adivina el número
         *
         * Escribe un programa en Java que te pida introducir un número y lo compare con otro número que puede ser aleatorio o establecido por tí.
         * Mientras que el número no sea igual al establecido como base, el programa se seguirá ejecutando.
         * Una vez que ambos números sean iguales, el programa se detendrá y mostrará lo siguiente en consola:
         *
         * "Felicidades, adivinaste el número."
         */

        Scanner sc = new Scanner(System.in);
        int numeroBase = 0;
        int numeroAleatorio = (int) (Math.random() * 100);

        System.out.println("Introduce un número entre 0 y 100");
        numeroBase = sc.nextInt();

        while (numeroBase != numeroAleatorio) {
            if (numeroBase > numeroAleatorio) {
                System.out.println("El número es más pequeño, prueba otra vez");
                numeroBase = sc.nextInt();
            } else if (numeroBase < numeroAleatorio){
                System.out.println("El número es más grande, prueba otra vez");
                numeroBase = sc.nextInt();
            }
        }
        System.out.println("Felicidades, adivinaste el número");
    }
}
