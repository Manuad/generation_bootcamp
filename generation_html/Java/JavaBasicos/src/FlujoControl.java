import java.util.Locale;
import java.util.Scanner;

public class FlujoControl {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Cual es tu edad?");
        int edad = entrada.nextInt();
        if (edad >= 18) {
            System.out.println("Eres un adulto joven");
            if (edad >= 50) {
                System.out.println("Eres un adulto mayor");
            }
        } else {
            System.out.println("Eres menor de edad");
        }

        String mensaje = (edad >= 18) ? "Eres un adulto joven" : "Eres menor de edad";
        System.out.println(mensaje);

        System.out.println("What is the day today?");
        String dia = entrada.next();
        entrada.close();

        switch (dia.toLowerCase()) {
            case "lunes":
                System.out.println("Hoy es lunes");
                break;
            case "martes":
                System.out.println("Hoy es martes");
                break;
            case "miercoles":
                System.out.println("Hoy es miercoles");
                break;
            case "jueves":
                System.out.println("Hoy es jueves");
                break;
            case "viernes":
                System.out.println("Hoy es viernes");
                break;
            case "sabado":
                System.out.println("Hoy es sabado");
                break;
            case "Domingo":
                System.out.println("Hoy es domingo");
                break;
            default:
                System.out.println("Es un dia de la semana no valido");
                break;
        }

    }

}
