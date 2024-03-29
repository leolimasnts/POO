package ativ01;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        float ammountOfGrades = 0;
        float sumOfAllGrades = 0;
        float averageGrade = 0;
        float lastGrade = 0;
        while (lastGrade != -1) {
            System.out.print("type a grade (-1 for finish): ");
            lastGrade = sc1.nextFloat();
            if (lastGrade == -1) break;
            sumOfAllGrades += lastGrade;
            ammountOfGrades++;
        }
        sc1.close();
        if (ammountOfGrades != 0) averageGrade = sumOfAllGrades / ammountOfGrades;

        System.out.println(averageGrade);
    }

}