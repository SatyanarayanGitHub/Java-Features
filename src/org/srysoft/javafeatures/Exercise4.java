package org.srysoft.javafeatures;

import java.util.function.BiConsumer;

/**
 * Exception Handling in Lambdas
 * 
 * 
 * @author SATYA
 *
 */
public class Exercise4 {

	public void process(int[] someNumbers, int key) {
		processBiConsumer(someNumbers, key, wrapperLambda((v, k) -> System.out.println(v / k)));
	}

	private void processBiConsumer(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
		for (int i : someNumbers)
			consumer.accept(i, key);
	}

	private BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {

		return (v, k) -> {
			try {
				consumer.accept(v, k);
			} catch (ArithmeticException e) {
				System.out.println("Dividend should not be 0");
			}
		};
	}

}
