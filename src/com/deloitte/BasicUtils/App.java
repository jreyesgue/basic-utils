package com.deloitte.BasicUtils;

import java.util.Scanner;

public class App {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean runAgain = true;

        do {
            displayMenu();

            switch (getOption()) {
                case 1:
                    displayCalculatorMenu();
                    break;
                case 2:
                    displayEncoderMenu();
                    break;
                case 3:
                    break;
                case 4:
                    runAgain = false;
            }
        } while (runAgain);
    }

    private static int getOption() {
        System.out.print("Option: ");
        return scanner.nextInt();
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

}
