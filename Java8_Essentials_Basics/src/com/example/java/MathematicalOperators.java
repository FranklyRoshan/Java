package com.example.java;

public class MathematicalOperators {
    public static void main(String[] args) {
        int intValue1 = 56;
        int intValue2 = 42;

        int result1 = intValue1 + intValue2;
        System.out.println("Addition: " + result1);

        int result2 = intValue2 - intValue2;
        System.out.println("Subtraction: " + result2);

        int result3 = intValue2 * intValue2;
        System.out.println("Multiplication: " + result3);

        double result4 = (double) intValue2 / intValue2;
        System.out.println("Division: " + result4);

        double result5 = (double) intValue2 % intValue2;
        System.out.println("Remainder: " + result5);

        double doubleValue1 = -3.99999d;
        long longRounded = Math.round(doubleValue1);
        System.out.println("Rounded off Value: " + longRounded);

        double absValue = Math.abs(doubleValue1);
        System.out.println("Abosolute value is: " + absValue);

    }
}
