package ativ03;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Student student = new Student();
        Scanner sc1 = new Scanner(System.in);

        System.out.println("1st exam: ");
        student.firstExam = sc1.nextFloat();
        System.out.println("2nd exam: ");
        student.secondExam = sc1.nextFloat();
        sc1.close();

        System.err.println("Situation: " + student.isApproved());
    }
}

