package ativ04;

public class Calculator {
    float firstNum;
    float secondNum;
    float result;
    String operator;

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public void setFirstNum(float firstNum) {
        this.firstNum = firstNum;
    }

    public void setSecondNum(float secondNum) {
        this.secondNum = secondNum;
    }

    void operate() {

        switch (this.operator) {
            case "+":
                this.result = this.firstNum + this.secondNum;
                break;
            case "-":
                this.result = this.firstNum - this.secondNum;
                break;
            case "*":
                this.result = this.firstNum * this.secondNum;
                break;
            case "/":
                this.result = this.firstNum / this.secondNum;
                break;
            default:
                System.out.println("Invalid character");
                break;

        }
    }

    public void printOperation() {
        System.out.println(this.firstNum + " " + this.operator + " " + this.secondNum + " = " + this.result);
    }

    public boolean validateOperator() {
        switch (this.operator) {
            case "+":
            case "-":
            case "*":
            case "/":
                return true;
            default:
                return false;
        }
    }
}
