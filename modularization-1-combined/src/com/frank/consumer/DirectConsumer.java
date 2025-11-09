/*
 *Java Build Path
 * 
 * Right Click (Alt + Enter) in project > Java Build Path > Projects > Class path > add > "Select project you wanna give access"
 * */

package com.frank.consumer;

import java.util.List;
import java.util.logging.Logger;

import com.frank.sorting.algorithm.BubbleSort;

public class DirectConsumer {

	private static Logger logger = Logger.getLogger(DirectConsumer.class.getName());

	public static void main(String[] agrs) {
		BubbleSort util = new BubbleSort();
		List<String> sorted = util.sort(List.of("Frank", "Dave", "John", "Ava", "Bruce", "Clark"));
		logger.info(sorted.toString());

	}
}

/*
 * Java Modularization - Remember
 * 
 * Module Descriptor - module-info.java: Defines metadata about the module:
 * 
 * I requires module.a; - I need module.a to do my work!
 * 
 * requires transitive module.a; - I need module.a to do my work AND my users
 * also need access to module.a
 * 
 * exports - Export package for use by other modules
 * 
 * opens package.b to module.a - Before Java 9, reflection can be used to find
 * details about types (private, public and protected). From Java 9, you can
 * decide which packages to expose:
 * 
 * Above statement allows module.a access to perform reflection on public types
 * in package.b
 * 
 * 
 * Advantages
 * 
 * Compile Time Checks - For availability of modules
 * 
 * Better Encapsulation - Make only a subset of classes from a module available
 * to other modules
 * 
 * Smaller Java Runtime - Use only the modules of Java that you need!
 * 
 */