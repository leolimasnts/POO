package ativ04;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {

            System.out.print("operator: ");
            calculator.setOperator(sc1.nextLine());
            
            if (!calculator.validateOperator()) {
                System.out.println("Goodbye!");
                break;
            }

            System.out.print("1st number: ");
            calculator.setFirstNum(sc1.nextFloat());

            System.out.print("2nd number: ");
            calculator.setSecondNum(sc1.nextFloat());

            sc1.nextLine();

            calculator.operate();
            calculator.printOperation();
        }
        sc1.close();
    }
}
