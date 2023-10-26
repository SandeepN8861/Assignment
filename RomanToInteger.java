package com.javaassignment.in;

import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman number:");
        String romanNumeral = scanner.nextLine();
        scanner.close();

        int result = romanToInt(romanNumeral);
        System.out.println(romanNumeral + " = " + result);
    }

    public static int romanToInt(String s) {
        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int curValue = 0;

            if (currentChar == 'I') {
                curValue = 1;
            } else if (currentChar == 'V') {
                curValue = 5;
            } else if (currentChar == 'X') {
                curValue = 10;
            } else if (currentChar == 'L') {
                curValue = 50;
            } else if (currentChar == 'C') {
                curValue = 100;
            } else if (currentChar == 'D') {
                curValue = 500;
            } else if (currentChar == 'M') {
                curValue = 1000;
            }

            if (curValue >= prevValue) {
                result += curValue;
            } else {
                result -= curValue;
            }
            prevValue = curValue;
        }

        return result;
    }
}

