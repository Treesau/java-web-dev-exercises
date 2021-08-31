package org.launchcode.java.studios.areaofacircle;

import java.io.IOException;
import java.util.Scanner;



public class Area {

    public static void main(String[] args) {

        Double radius;
        do {
            System.out.print("Enter a radius: ");
            try {
                Scanner input = new Scanner(System.in);
                radius = input.nextDouble();
            } catch (java.util.InputMismatchException e) {
                radius = -1.0;
            }
        } while (radius < 0);

        Double area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is " + area);
    }
}
