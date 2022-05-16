import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Calculadora");
        int opcion;

        try {
            do {
                System.out.println("1. Suma");
                System.out.println("2. Resta");
                System.out.println("3. Multiplicacion");
                System.out.println("4. Division");
                System.out.println("5. Salir");
                Scanner scanner = new Scanner(System.in);
                System.out.println("Seleccione una opcion: ");

                opcion= scanner.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Suma");
                        System.out.println("Ingrese el primer numero: ");
                        try {
                            double numero1 = scanner.nextDouble();
                            System.out.println("Ingrese el segundo numero: ");
                            double numero2 = scanner.nextDouble();
                            System.out.println("El resultado es: " + (numero1 + numero2));
                        } catch (InputMismatchException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;
                    case 2:
                        System.out.println("Resta");
                        System.out.println("Ingrese el primer numero: ");
                        try {
                            double numero3 = scanner.nextDouble();
                            System.out.println("Ingrese el segundo numero: ");
                            double numero4 = scanner.nextDouble();
                            System.out.println("El resultado es: " + (numero3 - numero4));
                        } catch (InputMismatchException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;
                    case 3:
                        System.out.println("Multiplicacion");
                        System.out.println("Ingrese el primer numero: ");
                        try {
                            double numero5 = scanner.nextDouble();
                            System.out.println("Ingrese el segundo numero: ");
                            double numero6 = scanner.nextDouble();
                            System.out.println("El resultado es: " + (numero5 * numero6));
                        } catch (InputMismatchException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;
                    case 4:
                        System.out.println("Division");
                        System.out.println("Ingrese el primer numero: ");
                        try {
                            double numero7 = scanner.nextDouble();
                            System.out.println("Ingrese el segundo numero: ");
                            double numero8 = scanner.nextDouble();
                            if (numero8 == 0) {
                                System.out.println("No se puede dividir por 0");
                            } else {
                                System.out.println("El resultado es: " + (numero7 / numero8));
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;
                    default:
                        System.out.println("Opcion no valida, intenta de nuevo");
                        break;
                }
            }
            while (opcion != 5);
        }
        catch (InputMismatchException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

