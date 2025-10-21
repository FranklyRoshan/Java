package com.example.java;

public class UsingJavaOperators {
    public static void main(String[] args) {

        // Java is a C-style language.
        // Operator mostly follow C Standards

        // Assignment and simple math
        int newValue;
        int intvalue = 10;

        // Arithmetic Operator
        int newValue1 = intvalue + 5;
        int newValue2 = intvalue - 5;
        int newValue3 = intvalue * 5;
        int newValue4 = intvalue / 5;
        int newValue5 = intvalue % 5;

        // Compound Assignment operator
//        intValue6 += 5;
//        intValue6 -=5;
//        intValue6 *= 5;
//        intValue6 /= 5;
//        intValue6 %= 5;

        // Equality Operators
        // Equality
        String these = "These";
        String those = "Those";

        if (these == those) {
            System.out.println("They match!");
        }

        // Inquality
        if (these == those) {
            System.out.println("No Match!");
        }

        // Relational (Comparison) Operators
        /*
         *  Operators   Purpose
         *      >       Greater than
         *      <       Less than
         *      >=      Greater than or equal
         *      <=      Less than or equal
         *  instanceof  class membership
         */

         String s = "Hello";
         if (s instanceof java.lang.String) {

            System.out.println("s is a String");
         }

         String s1 = "Hello";
         String s2 = "Hello";
         if(s1.equals(s2)) {
            System.out.println("They match!");
         } else {
            System.out.println("No match!");
         }

        // Logical Operator

        /*
         * Operators    Purpose
         *      &&      AND
         *      ||      OR
         *      ?:      Ternary (short-hand for if-then)
         */

        // Bitwise Operator

        // Increment and Decrement Operator
        // Postfix vs. prefix Increment and decrement operator
        int intValue6 = 10;

        // Post Increment and decrement
        intValue6++;
        intValue6--;

        // Pre Increment and decrement
        ++intValue6;
        --intValue6;


        // Classification by number of Operands

        // int a,b,c;
        // Unary Operators
        // ++a;
        // -b;
        // !c;
        // Binary Operators
        // a + b;
        // a == c;
        // Ternary (Conditional) Operators
        // a ? b : c;
        // String s = condition ? trueValue : falsevalue;
    }
}

