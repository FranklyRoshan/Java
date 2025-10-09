package com.Frankly.FunctionalProgramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


class EvenNumberPredicateBTS implements Predicate<Integer> {

	@Override
	public boolean test(Integer number) {
		return number % 2 == 0;
	}

}

class NumberSquareMapperBTS implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer number) {
		return number * number;
	}
}

class SysOutConsumerBTS implements Consumer<Integer> {

	@Override
	public void accept(Integer number) {
		System.out.println(number);
	}

}

public class LambdaBehindTheScenesRunner2 {

	public static void main(String[] args) {

//		1. Storing functions in variables
//		2. Passing functions to methods
//		3. Returning functions from methods

//		Perdicate - Refactor > Extract Local variable
		Predicate<? super Integer> evenPredicate = n -> n % 2 == 0;
//		Custom Predicate
//		Predicate<? super Integer> oddPredicate = n -> n % 2 == 0;
//		Perdicate - Refactor > Extract Local variable & Extract Method
		Predicate<? super Integer> oddPredicate = extractedOddPredicate();

		List.of(23, 433, 34, 45, 36, 48).stream().filter(evenPredicate).map(n -> n * n)
				.forEach(e -> System.out.println(e));

//		BTS
//		Implementation of Predicate, Function & Consumer
		List.of(23, 433, 34, 45, 36, 48).stream().filter(new EvenNumberPredicateBTS()).map(new NumberSquareMapperBTS())
				.forEach(new SysOutConsumerBTS());

//		Predicate
//		.filter(new EvenNumberPredicate())
//		Stream<T> filter(Predicate<? super T> predicate);
//		boolean test(T, t);

//		Function
//		.map(n -> n*n)
//		<R> Stream<R> map(Function<? super T, ? extends R> mapper);
//		R apply(T t);

//		Consumer
//		.filter(new EvenNumberPredicate())
//		Consumer<? super T> action
//		void accept(T t);

	}

	private static Predicate<? super Integer> extractedOddPredicate() {
		return n -> n % 2 == 1;
	}

}
