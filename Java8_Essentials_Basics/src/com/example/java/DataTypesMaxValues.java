package com.example.java;

public class DataTypesMaxValues {
	public static void main(String[] args) {

        // Byte
        System.out.println("Byte");
        byte b = 127;
        System.out.println("Byte: " + b);

        // b++;
        // System.out.println("Byte: " + b);
        // Output will be in negative

        if (b < Byte.MAX_VALUE) {
            b++;
        }
        System.out.println("Byte: " + b);

        // Integer
        System.out.println("Integer");
        int i = 2147483647;
        System.out.println("Integer: " + i);

        // i++;
        // System.out.println("Integer: " + i);
        // Output will be in negative

        if (i < Integer.MAX_VALUE) {
            i++;
        }
        System.out.println("Integer: " + i);
    }
}