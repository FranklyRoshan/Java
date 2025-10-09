package com.Frankly.FunctionalProgramming;

import java.util.List;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {
		List<String> list = List.of("Apple", "Banana", "Cantaloupe", "Durian");

//		printBasic(list);
//		printWithFP(list);
//		printBasicWithFiltering(list);
		printBasicWithFPFiltering(list);

	}

	private static void printBasic(List<String> list) {
		for (String string : list) {
			System.out.println("Element - " + string);
		}
	}

//	-> - Lambda Expression
	private static void printWithFP(List<String> list) {
		list.stream().forEach(element -> System.out.println("Element - " + element));
	}

	private static void printBasicWithFiltering(List<String> list) {
		for (String string : list) {
			if (string.endsWith("e")) {
				System.out.println("Element - " + string);
			}
		}
	}

	private static void printBasicWithFPFiltering(List<String> list) {
		list.stream().filter(element -> element.endsWith("e"))
				.forEach(element -> System.out.println("Element - " + element));
	}
}
