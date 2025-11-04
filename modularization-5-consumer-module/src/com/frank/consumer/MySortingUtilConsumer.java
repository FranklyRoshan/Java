package com.frank.consumer;

import java.util.List;
import java.util.logging.Logger;

import com.frank.sorting.util.MySortingUtil;


public class MySortingUtilConsumer {

	private static Logger logger = Logger.getLogger(MySortingUtilConsumer.class.getName());

	public static void main(String[] agrs) {
		MySortingUtil util = new MySortingUtil();
		List<String> sorted = util.sort(List.of("Frank", "Dave", "John", "Ava", "Bruce", "Clark"));
		logger.info(sorted.toString());

	}
}
