public class ConversionDatos {

    public static void main(String[] args) {

        byte numByte = 127;
        short numShort = numByte;
        int numInt = numShort;
        long numLong = -500000;

        //casteo o parseo
        int otroInt = (int) numLong;
        short otroShort = (short) otroInt;
        byte otroByte = (byte) otroShort;

    }
}

