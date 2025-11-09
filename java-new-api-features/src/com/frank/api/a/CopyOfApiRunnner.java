package com.frank.api.a;

import java.util.ArrayList;
import java.util.List;

public class CopyOfApiRunnner {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Frank");
		names.add("Steve");
		names.add("Jacob");
		List.of("Frank", "Steve", "Jacob");
		List<String> copyOfNames = List.copyOf(names);
		/*
		 * If you wanna create a immutable list/set/map from an existing list/set/map
		 * you can use "copyOf" method
		 */

		doNotChange(copyOfNames);
		System.out.println(copyOfNames);

	}

	private static void doNotChange(List<String> names) {
		names.add("ShouldNotBeAllowed");
	}

}
