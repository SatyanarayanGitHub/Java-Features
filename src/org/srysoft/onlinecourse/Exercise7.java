package org.srysoft.onlinecourse;

import java.util.Arrays;

public class Exercise7 {

	public static void main(String[] arg) {

		Exercise7 exe7 = new Exercise7();
		exe7.squareAndSum();

	}

	//Task 1: Square every number in a list and find the sum of squares
	int[] number = { 4, 5, 6 };

	private void squareAndSum() {
		int reduce = Arrays.stream(number).map(x -> x * x).reduce(0, Integer::sum);

		System.out.println("square and sum  = " + reduce);

	}

}
