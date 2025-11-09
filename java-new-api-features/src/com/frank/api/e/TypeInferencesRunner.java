package com.frank.api.e;

import java.util.List;

public class TypeInferencesRunner {

	public static void main(String[] args) {
		List<String> names1 = List.of("Frank", "Finn", "Fallon");
		List<String> names2 = List.of("John", "Jane");

//		List<List<String>> names = List.of(names1, names2);
		var names = List.of(names1, names2);
		names.stream().forEach(System.out::println);

		for (var name : names1) {
			System.out.println(name);
		}

//		List.of("Frankie", "Finley", "Fiona", "Felix").stream().filter(s -> s.length() < 5)
//		.forEach(System.out::println);
		
//		Local Variable (Alt + Shift + L)
//		Stream<String> filter = List.of("Frankie", "Finley", "Fiona", "Felix").stream();
		var filter = List.of("Frankie", "Finley", "Fiona", "Felix").stream();
		filter.filter(s -> s.length() < 5).forEach(System.out::println);

//		Local Variable Type Inference
//		1. Java compiler infers the type of the variable at compile time Introduced in
//		List<String> numbers = new ArrayList<>(List);
//		var numbers = new ArrayList<>(List);

//		2. Java 10 You can add "final" keyword if you want 
//		final var names = List.of(names1, names2);

//		4. var can be also used in loop
//		3. var can't accept null value.
//		var abc = null;
		
//		5. var isn't a keyword
		var var = "Frank";


	}

}
