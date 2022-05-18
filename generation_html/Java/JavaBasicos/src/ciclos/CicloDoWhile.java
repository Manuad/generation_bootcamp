package ciclos;

import javax.swing.*;

public class CicloDoWhile {

    public static void main(String[] args) {

        String clave = "Pedro";
        String comparacion = "";

        do {
            comparacion = JOptionPane.showInputDialog("Ingrese su clave");
            if (clave.equals(comparacion) == false) {
                System.out.println("Password incorrect");
            }
        } while (clave.equals(comparacion) == false);
        System.out.println("Password correct");
    }
}
