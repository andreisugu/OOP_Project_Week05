package Tema05;

// Tipuri primitive. Diferenta int si Integer

// Tipuri primitive => byte, short, int, long, float, double, boolean, char
// Integer => wrapper pentru primitiva int, cu conversie la alte tipuri si reprezentare String, vice versa, retine o valoare tip int

public class Main05 {
    public static void main(String[] args) {
        // Tipuri primitive
        byte v1 = 100;
        short v2 = 100;
        int v3 = 100;
        long v4 = 100;
        float v5 = 100.5f;
        double v6 = 100.555555d;
        char v7 = 'a';
        System.out.println("Byte: " + v1);
        System.out.println("Short: " + v2);
        System.out.println("Int: " + v3);
        System.out.println("Long: " + v4);
        System.out.println("Float: " + v5);
        System.out.println("Double: " + v6);
        System.out.println("Char: " + v7);

        // Diferenta int - Integer
        Integer myInteger = new Integer(200);
        System.out.println(myInteger.byteValue());
        System.out.println(myInteger.shortValue());
        System.out.println(myInteger.intValue());
        System.out.println(myInteger.longValue());
        System.out.println(myInteger.floatValue());
        System.out.println(myInteger.doubleValue());
        System.out.println(myInteger.toString());

    }
}
