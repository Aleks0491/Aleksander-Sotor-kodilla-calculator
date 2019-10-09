package com.calculator.calculator;

public class Calculator {

    double num1;
    double num2;

    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public void addingNums() {
        double sum = num1 + num2;
        System.out.println(sum);
    }

    public double subtractionNums() {
        double result = num2 - num1;
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator(4.5, 5.0);
        calculator.addingNums();
        calculator.subtractionNums();
    }
}
