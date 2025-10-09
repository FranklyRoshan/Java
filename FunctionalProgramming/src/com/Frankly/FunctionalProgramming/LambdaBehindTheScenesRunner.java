package com.Frankly.FunctionalProgramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


class EvenNumberPredicate implements Predicate<Integer> {

	@Override
	public boolean test(Integer number) {
		return number % 2 == 0;
	}

}

class NumberSquareMapper implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer number) {
		return number * number;
	}
}

class SysOutConsumer implements Consumer<Integer> {

	@Override
	public void accept(Integer number) {
		System.out.println(number);
	}

}

public class LambdaBehindTheScenesRunner {

	public static void main(String[] args) {

		List.of(23, 433, 34, 45, 36, 48).stream().filter(n -> n % 2 == 0).map(n -> n * n)
				.forEach(e -> System.out.println(e));

//		BTS
//		Implementation of Predicate, Function & Consumer
		List.of(23, 433, 34, 45, 36, 48).stream().filter(new EvenNumberPredicate()).map(new NumberSquareMapper())
				.forEach(new SysOutConsumer());

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

}
