package org.srysoft.onlinecourse;

import java.util.Arrays;

public class Exercise8 {

	public static void main(String[] arg) {

		Exercise8 exe8 = new Exercise8();
		exe8.findOddNumbers();
		exe8.findEvenNumbers();
	}

	// Task-1: find the sum of odd number in the list
	private void findOddNumbers() {
		int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int reduce = Arrays.stream(number).filter(x -> x % 2 == 1).reduce(0, Integer::sum);

		System.out.println("Sum of Odd number = " + reduce);
	}

	// Task-2: find the sum of even number in the list
	private void findEvenNumbers() {
		int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int reduce = Arrays.stream(number).filter(x -> x % 2 == 0).reduce(0, Integer::sum);

		System.out.println("Sum of Even number = " + reduce);
	}

}
