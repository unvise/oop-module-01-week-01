package com.unvise.oop;

public class Application {
    private static final String DIVIDER = "-----------------------------------------------";

    public static void main(String[] args) {
        System.out.println(DIVIDER);
        System.out.println("byte - 1 byte");
        // 1 byte -> 2^8 bit -> 256 -> -128..0..127
        System.out.printf("Min: %d; Max: %d%n\n", Byte.MIN_VALUE, Byte.MAX_VALUE);

        System.out.println(DIVIDER);
        System.out.println("short | char - 2 bytes");
        // 2 bytes -> 2^16 bit -> 256 -> -32768..0..32767
        System.out.printf("Min: %d; Max: %d\n", Short.MIN_VALUE, Short.MAX_VALUE);

        System.out.println(DIVIDER);
        System.out.println("int - 4 bytes");
        // 4 bytes -> 2^32 bit -> 4294967296 -> -2147483648..0..2147483647
        System.out.printf("Min: %d; Max: %d\n", Integer.MIN_VALUE, Integer.MAX_VALUE);

        System.out.println(DIVIDER);
        System.out.println("long - 8 bytes");
        // 8 bytes -> 2^64 bit -> 1.8446744e+19 -> -9223372036854775808..0..9223372036854775807
        System.out.printf("Min: %d; Max: %d\n", Long.MIN_VALUE, Long.MAX_VALUE);

        System.out.println(DIVIDER);
        System.out.println("float - 4 bytes");
        // (-1)^s × M × 2^E - where s mantissa char (1 bit), M mantissa (8 bit), E exponent - 23 + 1 bit
        System.out.printf("Min exp: %d; Max exp: %d\n", Float.MIN_EXPONENT, Float.MAX_EXPONENT);

        System.out.println(DIVIDER);
        System.out.println("double - 8 bytes");
        // (-1)^s × M × 2^E - where s mantissa char (1 bit), M mantissa (11 bit), E exponent - 52 + 1 bit
        System.out.printf("Min exp: %d; Max exp: %d\n", Double.MIN_EXPONENT, Double.MAX_EXPONENT);
    }
}
