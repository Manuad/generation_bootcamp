import java.util.Scanner;

public class Escanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int numero = scanner.nextInt();
        System.out.print("\n" + numero + "\n");
        String palabra = scanner.nextLine();
        System.out.println(palabra);
        if (numero < 10) {
            System.out.println("The number is less than 10");
        }
    }
}
