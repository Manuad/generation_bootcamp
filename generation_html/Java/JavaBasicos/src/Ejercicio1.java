import java.util.Scanner;

public class Ejercicio1 {
    /**
     * Crear una aplicación que reciba un entero entre 1 y 10 y que
     * muestre un mensaje según la calificación ingresada.
     * menos de 3 == "Failed"
     * menos de 5 == "Insuficient"
     * menor de 9 == "Good"
     * igual a 10 == "Excellent"
     * mayor a 10 == "Grade outside range"
     */

    public static void main(String[] args) {
        int calificacion = 0;
        System.out.println("Ingrese una calificación: ");
        Scanner scanner = new Scanner(System.in);
        calificacion = scanner.nextInt();
        if (calificacion < 3) {
            System.out.println("Failed");
        } else if (calificacion < 5) {
            System.out.println("Insuficient");
        } else if (calificacion < 9) {
            System.out.println("Good");
        }        else if (calificacion == 10) {
            System.out.println("Excellent");
        } else {
            System.out.println("Grade outside range");
        }
    }
}
