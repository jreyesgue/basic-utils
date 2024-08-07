package com.deloitte.BasicUtils.util;

import com.deloitte.BasicUtils.entity.MathOperation;

public class Calculator {

    private static final MathOperation addition = Double::sum;
    private static final MathOperation subtraction = (a, b) -> a - b;
    private static final MathOperation multiplication = (a, b) -> a * b;
    private static final MathOperation division = (a, b) -> a / b;

    public static void calculate(int operation, double a, double b) {
        switch (operation) {
            case 1:
                showResult(add(a, b));
                break;
            case 2:
                showResult(subtract(a, b));
                break;
            case 3:
                showResult(multiply(a, b));
                break;
            case 4:
                if (b != 0) {
                    showResult(divide(a, b));
                } else {
                    System.out.println("\nError: Cannot divide by zero.\n");
                }
                break;
            default:
                System.out.println("\nError: Invalid operation.\n");
        }
    }

    public static double add(double a, double b) {
        return addition.operate(a, b);
    }

    public static double subtract(double a, double b) {
        return subtraction.operate(a, b);
    }

    public static double multiply(double a, double b) {
        return multiplication.operate(a, b);
    }

    public static double divide(double a, double b) {
        return division.operate(a, b);
    }

    private static void showResult(double result) {
        System.out.printf("%nThe result is: %.1f%n%n", result);
    }

}
