package com.deloitte.BasicUtils;

import com.deloitte.BasicUtils.util.Calculator;
import com.deloitte.BasicUtils.util.Encoder;

import java.util.Scanner;

public class App {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean runAgain = true;
        int option;

        do {
            displayMenu();

            switch (getOption()) {
                case 1:
                    displayCalculatorMenu();

                    option = getOption();
                    double a = getCalculatorValue('a');
                    double b = getCalculatorValue('b');

                    Calculator.calculate(option, a, b);
                    break;
                case 2:
                    displayEncoderMenu();

                    option = getOption();
                    String value = getEncoderValue(option == 1 ? "encode" : "decode");

                    Encoder.operate(option, value);
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Goodbye :)");
                    runAgain = false;
                    break;
                default:
                    System.out.println("Error: Invalid option.\n");
            }
        } while (runAgain);
    }

    private static void displayMenu() {
        System.out.println("Please choose an option:");
        System.out.println("1.- Basic calculator.");
        System.out.println("2.- Encoder.");
        System.out.println("3.- Student average calculator.");
        System.out.println("4.- Exit.");
    }

    private static void displayCalculatorMenu() {
        System.out.println("Please choose an option:");
        System.out.println("1.- Sum (a + b)");
        System.out.println("2.- Subtract (a - b)");
        System.out.println("3.- Multiply (a * b)");
        System.out.println("4.- Divide (a / b)");
    }

    private static void displayEncoderMenu() {
        System.out.println("Please choose an option:");
        System.out.println("1.- Encode a String to Base 64.");
        System.out.println("2.- Decode a String from Base 64.");
    }

    private static int getOption() {
        System.out.print("Option: ");
        int option = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        return option;
    }

    private static double getCalculatorValue(char value) {
        System.out.printf("Please enter the value for %s: ", value);
        return scanner.nextDouble();
    }

    private static String getEncoderValue(String action) {
        System.out.printf("Please enter the string to %s: ", action);
        return scanner.nextLine();
    }

}
