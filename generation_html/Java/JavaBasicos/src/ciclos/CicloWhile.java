package ciclos;

import javax.swing.*;

public class CicloWhile {

    public static void main(String[] args) {
        /*
        //while

        int condicion = 0;
        while(condicion < 5) {
            System.out.println("Hola");
            condicion++;
        }
        */

        /**
         * Pequeña aplicación para validar contraseña haciendo uso de while
         */
        String clave = "Pedro";
        String comparacion = "";

        while (clave.equals(comparacion) == false) {
            comparacion = JOptionPane.showInputDialog("Ingrese su contraseña");
            if (clave.equals(comparacion) == false) {
                System.out.println("Wrong password");
            }
        }
        System.out.println("Correct password");
    }
}
