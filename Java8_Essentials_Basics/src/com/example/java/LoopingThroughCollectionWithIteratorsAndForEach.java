package com.example.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LoopingThroughCollectionWithIteratorsAndForEach {

	public static void main(String[] args) {
		System.out.println("ArrayList");
		List<String> list = new ArrayList<>();
		list.add("California");
		list.add("Oregon");
		list.add("Washington");

		System.out.println("toString() output.");
		System.out.println(list);
		System.out.println();

		System.out.println("ArrayList Iterator");
		for (String value : list) {
			System.out.println(value);
		}
		System.out.println();

		System.out.println("ArrayList ForEach");
		for (String value : list) {
			System.out.println(value);
		}
		System.out.println();

		System.out.println("Java 8 reference method");
		list.forEach(System.out::println);
		System.out.println();

		System.out.println("HashMap");
		Map<String, String> map = new HashMap<>();
		map.put("California", "Sacramento");
		map.put("Oregon", "Salem");
		map.put("Washington", "Olympia");
		map.put("Alaska", "Juneau");

		System.out.println("toString() output");
		System.out.println(map);
		System.out.println();

		System.out.println("HashMap Iterator");
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println("The capital  of " + key + " is " + map.get(key));
		}
		System.out.println();

		System.out.println("HashMap ForEach");
		for (String key : keys) {
			System.out.println("The capital  of " + key + " is " + map.get(key));
		}
		System.out.println();

	}

}
