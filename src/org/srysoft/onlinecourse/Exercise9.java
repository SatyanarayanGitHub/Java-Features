package org.srysoft.onlinecourse;

import java.util.Arrays;

public class Exercise9 {

	public static void main(String[] arg) {

		Exercise9 exe9 = new Exercise9();
		exe9.printDistinctAndSortValues();
		exe9.printsortedStringValues();

	}

	// Print distinct and sort number
	private void printDistinctAndSortValues() {

		int[] number = { 2, 5, 3, 4, 6, 1, 5, 3, 6, 4, 8 };

		Arrays.stream(number).distinct().forEach(System.out::println);
		System.out.println("=============================================");
		Arrays.stream(number).sorted().forEach(System.out::println);
		System.out.println("=============================================");
		Arrays.stream(number).distinct().sorted().forEach(System.out::println);
		System.out.println("=============================================");
	}

	//print
	private void printsortedStringValues() {
		String[] courses = { "Spring", "Zuul", "Docker", "Spring Boot", "AWS", "Jenkins", "Hibernate", "Spring Data",
				"API" };

		Arrays.stream(courses).sorted().forEach(System.out::println);

	}

}
