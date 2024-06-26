/*
Make a program that creates an iterative calculator.Supported
operations are: addition (+), subtraction (-), multiplication (*)
and division (/). The user chooses first the operation and then
enter the values ​​needed for the operation. O user can keep
choosing until typing „s‟ (or „S‟) in the operations menu.
*/

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
