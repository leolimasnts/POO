package ativ03;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        
        System.out.print("Sphere radius: ");
        
        Sphere sphere = new Sphere(sc1.nextDouble());

        System.out.println("Volume: " + sphere.getVolume());

        sc1.close();
    }
}
