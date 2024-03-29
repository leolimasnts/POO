package ativ04;

public class Number {
    int input;
    int factorial;

    public int setFactorial(int value) {
        if (value == this.input) {
            this.factorial = value * setFactorial(value - 1);
        }
        if (value > 1) {
            return value * setFactorial(value - 1);
        }
        return 1;
    }
}