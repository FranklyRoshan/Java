package com.example.java;

import java.util.HashMap;
import java.util.Map;

public class ManagingUnorderedDataWithHashmap {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();

		map.put("California", "Sacramento");
		map.put("Oregon", "Salem");
		map.put("Washington", "Olympia");
		System.out.println(map);

		map.put("Alaska", "Juneau");
		System.out.println(map);

		String cap = map.get("Oregon");
		System.out.println("The Capital of Oregon is " + cap);

		map.remove("California");
		System.out.println(map);

	}

}
