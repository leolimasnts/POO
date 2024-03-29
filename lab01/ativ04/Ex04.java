package ativ04;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Number number = new Number();
        Scanner sc1 = new Scanner(System.in);

        System.out.println("number: ");
        number.input = sc1.nextInt();
        sc1.close();
        number.setFactorial(number.input);

        System.out.println(number.factorial);
    }

}

