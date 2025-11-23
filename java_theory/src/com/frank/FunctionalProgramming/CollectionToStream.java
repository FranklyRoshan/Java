package com.frank.FunctionalProgramming;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class CollectionToStream {

	public static void main(String[] args) {
		/*
		 * 1. From Collections (Lists, Sets, Maps) What? Convert collections into
		 * streams. Why? Allows functional operations on lists, sets, and maps. How? Use
		 * .stream()
		 */

		List<Integer> numbers = List.of(1, 2, 3, 4, 5);
		Stream<Integer> numberStream = numbers.stream();
		numberStream.forEach(System.out::println);

		// {Java=100, Python=80}
		Map<String, Integer> courses = Map.of("Java", 100, "Python", 80);

		// ["Java", "Python"]
		Stream<String> keyStream = courses.keySet().stream();

		// [100, 80]
		Stream<Integer> valueStream = courses.values().stream();

		// {Java=100, Python=80}
		Stream<Map.Entry<String, Integer>> entryStream = courses.entrySet().stream();

	}

}
