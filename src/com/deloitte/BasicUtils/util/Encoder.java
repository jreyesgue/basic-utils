package com.deloitte.BasicUtils.util;

import java.util.Base64;

public class Encoder {

    public static void operate(int operation, String value) {
        switch (operation) {
            case 1:
                showResult("Encoded", encode(value));
                break;
            case 2:
                showResult("Decoded", decode(value));
                break;
            default:
                System.out.println("\nError: Invalid operation.\n");
        }
    }

    public static String encode(String s) {
        return Base64.getEncoder().encodeToString(s.getBytes());
    }

    public static String decode(String s) {
        byte[] decodedBytes = Base64.getDecoder().decode(s);
        return new String(decodedBytes);
    }

    private static void showResult(String action, String result) {
        System.out.printf("%n%s string is: %s%n%n", action, result);
    }

}
