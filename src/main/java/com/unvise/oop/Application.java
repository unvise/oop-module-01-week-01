package com.unvise.oop;

import com.unvise.oop.shape.Shape;
import com.unvise.oop.shape.icosahedron.Icosahedron;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        while (true) {
            try {
                System.out.print("Input icosahedron fin length: ");
                // if char '.' doesn't work, try ','
                double finLength = new Scanner(System.in).nextDouble();

                Shape icosahedron = Icosahedron.builder()
                        .finLength(finLength)
                        .build();

                System.out.printf("Icosahedron volume: %f\n", icosahedron.volume());
                break;
            } catch (InputMismatchException e) {
                System.out.println("Inputted value isn't number. Try again...");
            }
        }
    }
}
