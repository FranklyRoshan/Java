package com.frank.java_platform;

import java.util.ArrayList;
import java.util.List;

public class EscapeAnalysisExample {

	public static void main(String[] args) {
		for (int i = 0; i < 1_000_000; i++) {
			// Likely optimized away by Escape Analysis
			List<Integer> numbers = createList();
		}
	}

	static List<Integer> createList() {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		return list;
	}

}

/*
 * Escape Analysis
 *
 * What?: Determines whether an object escapes the current method and allocates
 * it on the stack instead of the heap if possible.
 *
 * Why?: Reduces garbage collection overhead and improves memory efficiency.
 *
 */
