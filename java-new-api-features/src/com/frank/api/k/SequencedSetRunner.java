package com.frank.api.k;

import java.util.LinkedHashSet;
import java.util.List;

public class SequencedSetRunner {

	public static void main(String[] args) {
		var courses = List.of("Spring", "Spring Boot", "Spring Security", "Spring Boot in AI");
		var courseDetailsSet = new LinkedHashSet<>(courses);
		courseDetailsSet.add("Spring"); // Set doesn't add duplicate values

		System.out.println("Order::" + courseDetailsSet); // Set always automatically arranged in orderly fashion
		System.out.println("Remove The First Element::" + courseDetailsSet.removeFirst());
		System.out.println("Remove The Last Element::" + courseDetailsSet.removeLast());


		System.out.println("List:: " + courseDetailsSet);
		System.out.println("The Fist Element::" + courseDetailsSet.getFirst());
		System.out.println("The Last Element::" + courseDetailsSet.getLast());

		courseDetailsSet.add("Spring");
		courseDetailsSet.add("Spring Ai");
		System.out.println("Reversed Set::" + courseDetailsSet.reversed());
		System.out.println("Sequenced Set::" + courseDetailsSet);
	}

}
