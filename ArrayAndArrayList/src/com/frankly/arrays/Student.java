package com.frankly.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

	private String name;
	private ArrayList<Integer> marks = new ArrayList<>();

//	Before implementing the Variable argument
//	public Student(String name, int[] marks) {
//		this.name = name;
//		this.marks = marks;
//	}

//	After implementing the Variable argument
//	Note: Variable Argument parameter should be declared in the last
	public Student(String name, int... marks) {
		this.name = name;

		for (int mark : marks) {
			this.marks.add(mark);
		}
	}

	public int getNumberOfMarks() {
		int number = marks.size();
		return number;
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		return sum;
	}

	public int getMaximumMark() {
//		int max = Integer.MIN_VALUE;
//		for (int mark : marks) {
//			if (mark > max) {
//				max = mark;
//			}
//		}
//		return max;

		return Collections.max(marks);
	}

	public int getMinimumMark() {
//		int min = Integer.MAX_VALUE;
//		for (int mark : marks) {
//			if (mark < min) {
//				min = mark;
//			}
//		}
//		return min;

		return Collections.min(marks);
	}

	public BigDecimal getAverageMarks() {
		int sum = getTotalSumOfMarks();
		int number = getNumberOfMarks();

		BigDecimal average = new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
		return average;
	}

//	toString - hashcode > String
	@Override
	public String toString() {
		return name + marks;
	}

	public void addNewmark(int mark) {
		marks.add(mark);
	}

	public void removeMarkAtIndex(int index) {
		marks.remove(index);
	}



}
