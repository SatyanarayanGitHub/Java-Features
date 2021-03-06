package org.srysoft.onlinecourse;

import java.util.Arrays;

public class Exercise7 {

	public static void main(String[] arg) {

		Exercise7 exe7 = new Exercise7();
		exe7.squareAndSum();
		exe7.cubeAndSum();

	}

	//Task 1: Square every number in a list and find the sum of squares	
	private void squareAndSum() {
		int[] number = { 4, 5, 6 };

		int reduce = Arrays.stream(number).map(x -> x * x).reduce(0, Integer::sum);

		System.out.println("Square and sum  = " + reduce);
	}

	//Task 2: Cube every number in a list and find the sum of cubes	
	private void cubeAndSum() {
		int[] number = { 4, 5, 6 };

		int reduce = Arrays.stream(number).map(x -> x * x * x).reduce(0, Integer::sum);

		System.out.println("Cube and sum  = " + reduce);
	}
}
