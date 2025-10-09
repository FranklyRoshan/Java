package com.frankly.java.Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

	public static void main(String[] args) {

		List<Character> character = List.of('A', 'Z', 'A', 'B', 'Z', 'F');

//		Unique - Set (Collections of unique value)
//		Hash, LinkedHash, Tree

//		TreeSet (pre-sorted set with Unique value (w/o repetition)) 
		Set<Character> treeSet = new TreeSet<>(character);
		System.out.println(treeSet);

//		LinkedHashSet (Insertion order with Unique value (w/o repetition))
		Set<Character> linkedHashSet = new LinkedHashSet<>(character);
		System.out.println(linkedHashSet);

//		HashSet (Random ordered by hashcode with Unique value (w/o repetition))
		Set<Character> hashSet = new HashSet<>(character);
		System.out.println(hashSet);

	}

}
