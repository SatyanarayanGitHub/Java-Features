package org.srysoft.onlinecourse;

import java.util.Arrays;

public class Exercise7 {

	//Task: Square every number in a list and fint the sum of squares

	public static void main(String[] arg) {

		Exercise7 exe7 = new Exercise7();
		exe7.task();

	}

	private void task() {
		int[] number = { 4, 5, 6 };

		int reduce = Arrays.stream(number).map(x -> x * x).reduce(0, Integer::sum);

		System.out.println("square and sum  = " + reduce);

	}

}
