package com.unvise.oop;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.print("Input your name: ");
        System.out.printf("Hello, %s!", new Scanner(System.in).nextLine());
    }
}
