package com.frank.api.k;

import java.util.ArrayList;

public class SequencedListRunner {

	public static void main(String[] args) {
		var courseDetails = new ArrayList<>();
		courseDetails.add("Spring Security");

		courseDetails.addFirst("Spring Boot");
		courseDetails.addLast("Spring Boot in AI");

		courseDetails.add("Cloud Computing with AWS");
		courseDetails.add("Cloud Computing with Azure");

		System.out.println("Remove The First Element::" + courseDetails.removeFirst());
		System.out.println("Remove The Last Element::" + courseDetails.removeLast());

		System.out.println("List:: " + courseDetails);
		System.out.println("The Fist Element::" + courseDetails.getFirst());
		System.out.println("The Last Element::" + courseDetails.getLast());

		var reverseCourseDetails = courseDetails.reversed();
		System.out.println("Reversed List::" + reverseCourseDetails);
		System.out.println("Sequenced List::" + courseDetails);


	}

}

/*
 * Exploring API of Sequenced Collections (Java 21)
 * 
 * interface Sequenced Collection<E> extends Collection<E> {
 * 
 * }
 * 
 * void addFirst(E); // Add as first element in the collection
 * 
 * void addLast(E); // Add as last element in the collection
 * 
 * E getFirst(); // Get first element from the collection
 * 
 * E getLast(); // Get last element from the collection
 * 
 * E removeFirst(); // remove first element from the collection
 * 
 * E removeLast(); // remove last element from the collection
 * 
 * SequencedCollection<E> reversed(); }
 * 
 * 
 * SequencedCollection: Extends Collection
 * 
 * Adds a few new methods
 * 
 * Need For Sequenced Collections (Java 21)
 * 
 * // Get the first element of the list String firstElement = list.get(0); //
 * Get the last element of the list int lastIndex = list.size() - 1: String
 * lastElement = list.get(lastIndex);
 * 
 * Imagine getting the first element of collection ■ It's pretty simple
 * 
 * Imagine accessing last element of collection ■ It's a little bit more complex
 * 
 * What if there is a Java API that makes it simple?
 * 
 * Solution: SequencedCollection Interface (along with Sequence SequencedMap)
 * 
 * Widely Implemented: Almost all important collection implementations support
 * some form of sequenced collections operations (ArrayList, LinkedList,
 * HashSet)
 * 
 * Tip: Also allows to access the collection in a reversed order
 * 
 */