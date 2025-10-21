package com.example.java;

public class ConvertingNumbericValues {
    public static void main(String[] args) {
        int intValue1 = 69;
        int intValue2 = intValue1;
        System.out.println("The 1st value is: " + intValue1);
        System.out.println("The 2nd value is: " + intValue2);

        // implicit casting (Widening)
        long longValue1 = intValue1;
        System.out.println("The long value is: " + longValue1);

        // explicit casting (Narrowing)
        short shortValue = (short) intValue1;
        System.out.println("The short value is: " + shortValue);

        int intValue3 = 1024;
        byte byteValue = (byte) intValue3;
        System.out.println("The byte value is: " + byteValue);

        double doubleValue = 3.99999d;
        int intValue4 = (int) doubleValue;
        System.out.println("The double value is: " + intValue4);


    }
}