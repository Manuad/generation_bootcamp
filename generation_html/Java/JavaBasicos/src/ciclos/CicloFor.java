package ciclos;

public class CicloFor {

    public static void main(String[] args) {
        /**
         * for (int i = 0; i < 5; i++) {
         *             System.out.println("Hola " + i);
         *         }
         *
         *         for (int i = 5; i > 0; i--) {
         *             System.out.println("Hola x" +i);
         *         }
         *
         *         for (int i = 0; i < 20; i+=2) {
         *             System.out.println("Hola x" +i);
         *         }
         */
        for (int i = 0; i < 40; i++) {
            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
                //System.out.println("Hola x" + i);
                continue;
            }
            System.out.println(i);
        }
    }
}
