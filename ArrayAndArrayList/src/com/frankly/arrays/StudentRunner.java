package com.frankly.arrays;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
//		Before Inline Refactor (Refactor Alt+Shift+T) (Inline Refactor Alt+Shift+I)
//		int[] marks = { 99, 98, 100, 95, 92 };
//		Student student = new Student("Frank", marks);

//		After Inline Refactor 
//		Student student = new Student("Frank", new int[] { 99, 98, 100, 95, 92 });

//		Before Using Variable Argument
//		Student student = new Student("Frank", new int[] {97, 98, 100, 99, 92});
//		Student student2 = new Student("Franklyn", new int[] {97, 98});
//		Student student3 = new Student("Franklin", new int[] {97, 98, 90});

//		After Using Variable Argument (variable argument implemented in "Student.Java")
//		Note: Variable Argument parameter should be declared in the last
		Student student = new Student("Frank", 97, 98, 100, 99, 92);
		Student student2 = new Student("Franklyn", 97, 98);
		Student student3 = new Student("Franklin", 97, 98, 90);

		int number = student.getNumberOfMarks();
		System.out.println("Number of marks: " + number);

		int sum = student.getTotalSumOfMarks();
		System.out.println("Total Sum of Marks: " + sum);

		int max = student.getMaximumMark();
		System.out.println("Maximum Mark: " + max);

		int min = student.getMinimumMark();
		System.out.println("Minimum Mark: " + min);

		BigDecimal average = student.getAverageMarks();
		System.out.println("Average Mark: " + average);

		System.out.println(student);

		student.addNewmark(35);
		System.out.println(student);

		student.removeMarkAtIndex(1);
		System.out.println(student);
	}

}
