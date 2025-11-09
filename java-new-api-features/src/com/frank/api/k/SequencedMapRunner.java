package com.frank.api.k;

import java.util.LinkedHashMap;

public class SequencedMapRunner {

	public static void main(String[] args) {

		var courseDetails = new LinkedHashMap<>();
		courseDetails.put(1, "Spring");
		courseDetails.put(2, "Spring Boot");
		courseDetails.put(3, "Spring AI");
		System.out.println("Map::" + courseDetails);

		System.out.println("Adding Elements");
		courseDetails.putFirst(10, "Spring Security");
		courseDetails.putLast(20, "Spring Cloud");
		System.out.println("Map::" + courseDetails);

		System.out.println("The First Entry::" + courseDetails.firstEntry());
		System.out.println("The Last Entry::" + courseDetails.lastEntry());

		System.out.println("SequencedKeySet::" + courseDetails.sequencedKeySet());
		System.out.println("SequenceValues::" + courseDetails.sequencedValues());
		System.out.println("SequenceEntrySet::" + courseDetails.sequencedEntrySet());

		System.out.println("The First Poll Entry::" + courseDetails.pollFirstEntry());
		System.out.println("Map::" + courseDetails);
		System.out.println("The Last Poll Entry::" + courseDetails.pollLastEntry());
		System.out.println("Map::" + courseDetails);

		System.out.println("Reversed::" + courseDetails.reversed());
		System.out.println("Sequenced Map::" + courseDetails);

	}

}
