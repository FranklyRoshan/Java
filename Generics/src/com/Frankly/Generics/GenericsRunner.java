package com.Frankly.Generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class GenericsRunner {

	public static void main(String[] args) {
//		Generic Class's code
		MyCustomList<String> list = new MyCustomList<>();
		list.addElement("Element 1");
		list.addElement("Element2");
		String value = list.get(0);

		System.out.println(list);
		System.out.println(value);
		
		MyCustomList<Integer> list2 = new MyCustomList<>();
		list2.addElement(Integer.valueOf(5));
		list2.addElement(Integer.valueOf(7));
		Integer number = list2.get(0);

		System.out.println(list2);
		System.out.println(number);

//		Generic Method's code
		String value1 = doubleValue(new String());
		Integer number1 = doubleValue(Integer.valueOf(5));
		ArrayList list1 = doubleValue(new ArrayList());

//		Lists
		ArrayList numbers1 = new ArrayList<>(List.of(1, 2, 3));
		duplicate(numbers1);
		System.out.println(numbers1);

		LinkedList numbers2 = new LinkedList<>(List.of(1, 2, 3));
		duplicate(numbers2);
		System.out.println(numbers2);

		Vector numbers3 = new Vector<>(List.of(1, 2, 3));
		duplicate(numbers3);
		System.out.println(numbers3);

		/*
		 * Stack numbers4 = new Stack<>(List.of(1, 2, 3));
		 * 
		 * Stack extends Vector (which extends AbstractList).
		 * 
		 * Unlike ArrayList, LinkedList, or Vector, the Stack class does not provide a
		 * constructor that accepts a Collection.
		 * 
		 * So, Java complains: “constructor Stack in class Stack cannot be applied to
		 * given types”.
		 */
		
		Stack numbers4 = new Stack<>();
		numbers4.addAll(List.of(1, 2, 3));
		duplicate(numbers4);
		System.out.println(numbers4);

//		Wildcards
//		Upperbound Wildcard
		System.out.println(sumOfNumberList(List.of(1, 2, 3, 4, 5)));
		System.out.println(sumOfNumberList(List.of(1.1, 2.2, 3.3, 4.4, 5.5)));
		System.out.println(sumOfNumberList(List.of(1l, 2l, 3l, 4l, 5l)));

//		Lowerbound wildcard
		List emptyList = new ArrayList<Number>();
		addAcoupleOfValue(emptyList);
		System.out.println(emptyList);
	}

//	Generic Method
	static <X> X doubleValue(X value) {
		return value;
	}

	public static <X extends List> void duplicate(X list) {
		list.addAll(list);
	}

//	Generics Wildcards
//	UpperBound Wildcard
	static double sumOfNumberList(List<? extends Number> numbers) {
		double sum = 0.0;
		for (Number number : numbers) {
			sum += number.doubleValue();
		}
		return sum;
	}

//	LowerBound Wildcard
	static void addAcoupleOfValue(List<? super Number> numbers) {
		numbers.add(1);
		numbers.add(1.0);
		numbers.add(1.0f);
		numbers.add(1l);
	}

}
