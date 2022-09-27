package com.unvise.oop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        try {
            System.out.print("Input icosahedron fin length: ");
            // if char '.' doesn't work, try ','
            double finLength = new Scanner(System.in).nextDouble();
            Double icosahedronVolume = Icosahedron.volume(finLength);
            System.out.printf("Icosahedron volume: %f\n", icosahedronVolume);
        } catch (InputMismatchException e) {
            System.out.println("Inputted value isn't number. Try again...");
        }
    }
}
