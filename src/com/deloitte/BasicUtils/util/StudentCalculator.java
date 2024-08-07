package com.deloitte.BasicUtils.util;

import com.deloitte.BasicUtils.entity.Student;

import java.util.Map;
import java.util.OptionalDouble;
import java.util.Scanner;

public class StudentCalculator {

    private static Student student;

    public static void createStudent(Scanner scanner) {
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Please enter your grade: ");
        String grade = scanner.nextLine();

        student = new Student(name, grade);

        getStudentSignatures(scanner);
        showStudentReport();
    }

    private static void getStudentSignatures(Scanner scanner) {
        String signatureName;
        double signatureGrade;

        System.out.print("Please enter the number of signatures to enroll: ");
        int signatures = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= signatures; i++) {
            System.out.printf("\nPlease enter the name of the signature %d: ", i);
            signatureName = scanner.nextLine();
            System.out.printf("Please enter the score for %s: ", signatureName);
            signatureGrade = scanner.nextDouble();
            scanner.nextLine();

            student.addSignature(signatureName, signatureGrade);
        }
    }

    private static void showStudentReport() {
        Map<String, Double> studentSignatures = student.getSignatures();
        double studentAvg = studentSignatures.values().stream()
                .mapToDouble((Double::valueOf))
                .average()
                .orElse(0);
        String status = studentAvg <= 7 ? "Failed" : "Passed";

        System.out.println("\n------------------------------------------------------------");
        System.out.printf("Student name: %-30s\tGrade: %s%n", student.getName(), student.getGrade());
        System.out.println("------------------------------------------------------------");
        studentSignatures
                .forEach((name, grade) -> System.out.printf("\t\tSignature: %-25s\tScore: %.1f%n", name, grade));
        System.out.println("------------------------------------------------------------");
        System.out.printf("Final average: %.2f\t\t\t\t\t\t\tStatus: %s%n%n", studentAvg, status);
    }

}
