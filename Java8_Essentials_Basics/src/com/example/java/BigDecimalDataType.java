package com.example.java;

import java.math.BigDecimal;

public class BigDecimalDataType {
    public static void main(String[] args) {
        double value = .012;
        double psum = value + value + value;

        System.out.println("Sum of prmitives: " + psum);

        String strValue = Double.toString(value);
		System.out.println("strValue: " + strValue);
        BigDecimal bigValue = new BigDecimal(strValue);

        BigDecimal bSum = bigValue.add(bigValue).add(bigValue);
        System.out.println("Sum of BigDecimals: " + bSum);

    }
}
