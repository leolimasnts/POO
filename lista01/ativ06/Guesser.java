package ativ06;

import java.util.Random;

public class Guesser {
    Random rand = new Random();

    private int maxValueToGuess = 101;
    private int minValueToGuess = 0;
    private int guess;
    private int counter = 0;

    public void generateGuess() {
        this.guess = rand.nextInt(maxValueToGuess) + minValueToGuess;
    }

    public int getGuess() {
        return guess;
    }

    public void adjustMinMaxValues(String guessIsBiggerOrSmaller) {
        if (guessIsBiggerOrSmaller.equals("+")) {
            maxValueToGuess -= guess - minValueToGuess;
            minValueToGuess = guess;
            
            return;
        }
        
        maxValueToGuess = guess - minValueToGuess;

    }

    public boolean iGuessed(String iGuessed) {
        if (iGuessed.equals("n")) {
            return false;
        }
        return true;

    }

    public void count() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}
