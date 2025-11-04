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
