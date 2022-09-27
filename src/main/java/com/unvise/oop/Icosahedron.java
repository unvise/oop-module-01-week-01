package com.unvise.oop;

public class Icosahedron {
    public static Double volume(Double finLength) {
        return 5d / 12 * (3 + Math.sqrt(5)) * Math.pow(finLength, 3);
    }
}
