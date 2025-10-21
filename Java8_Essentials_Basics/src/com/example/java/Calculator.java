package com.example.java;

import java.util.Scanner;

import com.example.java.utilies.CalculatorMathHelper;

public class Calculator {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.calculate();

	}

	protected void calculate() {
		InputHelper helper = new InputHelper();
		String s1 = helper.getInput("Enter a numeric value: ");
		String s2 = helper.getInput("Enter a numeric value: ");
		String op = helper.getInput("Choose an operation (+ = * / %): ");

		double result = 0;

		try {
			switch (op) {
			case ("+"):
				result = CalculatorMathHelper.addValues(s1, s2);
				break;
			case ("-"):
				result = CalculatorMathHelper.subValues(s1, s2);
				break;
			case ("*"):
				result = CalculatorMathHelper.productValues(s1, s2);
				break;
			case ("/"):
				result = CalculatorMathHelper.divideValues(s1, s2);
				break;
			case ("%"):
				result = CalculatorMathHelper.remainderValues(s1, s2);
				break;
			default:
				System.out.println("Unregonized Operation");
				return;
			}
			System.out.println("The answer is: " + result);

		} catch (Exception e) {
			System.out.println("Number Formatting exception: " + e.getMessage());
		}
	}

	// Nested Class
	class InputHelper {
		private String getInput(String prompt) {
			System.out.print(prompt);
			Scanner sc = new Scanner(System.in);
			return sc.nextLine();
		}
	}

}

