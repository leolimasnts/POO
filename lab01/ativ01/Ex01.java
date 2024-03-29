/*
Write a program in Java that reads 2 input rays R and r and
calculates the area of ​​the circular crown A = pi * (R^2 - r^2).
Consider pi = 3.14159 
*/

package ativ01;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Scanner sc1 = new Scanner(System.in);
        double crownArea;

        System.out.println("1st radius:");
        c1.radius = sc1.nextDouble();
        System.out.println("2nd radius:");
        c2.radius = sc1.nextDouble();

        sc1.close();

        if (c1.radius < c2.radius) {
            double aux = c1.radius;
            c1.radius = c2.radius;
            c2.radius = aux;
        }

        crownArea = c1.getArea() - c2.getArea();
        System.out.println("Area: " + crownArea);
    }
}
