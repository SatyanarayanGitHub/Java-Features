package org.srysoft.javafeatures;

import java.util.Arrays;
import java.util.List;

public class MainApplication {

	public static void main(String[] args) {

		String[] list1 = { "Apple", "Bat", "Cat", "Dog", "Elephant", "Fist", "Goat" };
		List<String> alphabet = Arrays.asList(list1);

		//Program1 prog1 = new Program1();
		//prog1.printWithFP(alphabet);
		//prog1.printWithFilterFP(alphabet);

		Integer[] list2 = { 4, 6, 9, 8, 13, 11, 15, 4, 9, 8, 3};
		List<Integer> numbers = Arrays.asList(list2);
		Program2 prog2 = new Program2();
		//prog2.printNumbers(numbers);
		//prog2.sumNumbers(numbers);
		//prog2.sumOddNumbers(numbers);
		//prog2.sortNumbers(numbers);
		prog2.showDistinctNumber(numbers);
		System.out.println("---------------------------------");
		prog2.showDistinctSquareNumber(numbers);
		System.out.println("---------------------------------");

	}

}
