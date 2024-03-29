package ativ02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
    
        Person person = new Person();
        Scanner sc1 = new Scanner(System.in);
    
        System.out.println("name: ");
        person.name = sc1.nextLine();
        
        System.out.println("age: ");
        person.age = sc1.nextInt();
        
        System.out.println("height: ");
        person.height = sc1.nextFloat();
        
        sc1.close();

        System.out.println("name: " + person.name);
        System.out.println("age: " + person.age);
        System.out.println("height: " + person.height);
    }
}
