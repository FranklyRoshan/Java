package com.frankly.multithreading;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiAnyCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService executorService = Executors.newFixedThreadPool(3);

		List<CallableTask> tasks = List.of(new CallableTask("Franklyn"), new CallableTask("Franklin"),
				new CallableTask("Frankie"));

		String result = executorService.invokeAny(tasks);

		System.out.println(result);
	
		executorService.shutdown();
	}

}
