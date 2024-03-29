package ativ03;

public class Student {
    float firstExam;
    float secondExam;

    String isApproved() {
        float average = (firstExam + secondExam) / 2;
        if(average > 7) return "Noice";
        if(average > 3) return "Final exam";
        return "Looser :P";
    }
}