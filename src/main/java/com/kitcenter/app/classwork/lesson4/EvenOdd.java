package com.kitcenter.app.classwork.lesson4;

import java.util.Scanner;

public class EvenOdd {
    public static void defineNumber () {
        Scanner scanner = new Scanner(System.in);

        double radius1 = scanner.nextDouble();

        if (radius1%2 > 0) {
            System.out.print("Radius 1 is odd ");
        } else {
            System.out.print("Radius 1 is even ");
        }
    }
}
