import java.util.Objects;

public class OperadoresLogicos {


    public static void main(String[] args) {
        int num = 12;
        num = 45;
        num = Integer.parseInt("45");

        System.out.println(num);
        int num1, num2;
        num1 = 10;
        num2 = 20;
        System.out.println("num: " + num1);

        System.out.println("num: " + num2);
        System.out.println(num1 == num2);

        System.out.println(Objects.equals(num1, num2));
        //Operadores de comparacion
        //< > <= >= != == && || !
        int num3, num4;

        num3 = 15;
        num4 = 20;

        System.out.println(num3 < num4);
        System.out.println(num3 > num4);
        System.out.println(num3 <= num4);
        System.out.println(num3 >= num4);
        System.out.println(num3 != num4);
        System.out.println(num3 == num4);

        if(num3 < num4){
            System.out.println(num3 + " es menor que " + num4);
        }
        else System.out.println(num3 + " es mayor que " + num4);

        System.out.println(num3 != num4);
        boolean comparacion = num3 != num4;
        System.out.println(comparacion);

        //Operadores logicos
        //&& || !.
        // && = y
        // || = o
        // ! = no
        boolean x = true;
        boolean y = false;
        boolean z = x && y;
        System.out.println(z);
        z = x || y;
        System.out.println(z);
        z = !x;
        System.out.println(z);
        System.out.println(!z);
        System.out.println(!x && !y);
        System.out.println(!x || !y);
        System.out.println(!x && y);
        System.out.println(x && !y);
        System.out.println(x || y);
        System.out.println(x || !y);
        System.out.println(!x || y);
        System.out.println(!(x && y));
    }
}
