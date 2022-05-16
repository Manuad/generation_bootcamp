import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        /**
         * Escribir una aplicación que calcule el indice de masa corporal de una persona.
         * Si tiene un IMC entre 18.5 y 25:
         * "Your weigh ratio is good"
         * si es menor de 18.5 o mayor de 25:
         * "Your health is not good"
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu altura en metros: ");
        double altura = sc.nextDouble();
        System.out.println("Introduce tu peso en kg: ");
        double peso = sc.nextDouble();
        double imc = peso / (Math.pow(altura, 2));
        System.out.println("Tu indice de masa corporal es: " + imc);
        if (imc >= 18.5 && imc <= 25) {
            System.out.println("Your weigh ratio is good");
        }
    }
}
