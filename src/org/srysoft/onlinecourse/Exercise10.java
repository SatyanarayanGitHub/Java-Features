package org.srysoft.onlinecourse;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise10 {

	public static void main(String[] arg) {

		Exercise10 exe10 = new Exercise10();
		exe10.evenNumberList();
		exe10.lengthofList();

	}

	// Create a List with Even Numbers Filtered from the Number Lists
	public void evenNumberList() {

		List<Integer> number = List.of(2, 5, 6, 3, 8, 41, 23, 56, 84, 41);

		List<Integer> evenNumbers = number.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());

		evenNumbers.stream().forEach(System.out::println);
	}

	// Create a List with lengths of all course titles
	public void lengthofList() {
		List<String> courses = List.of("Spring", "Zuul", "Docker", "Spring Boot", "AWS", "Jenkins", "Hibernate",
				"Spring Data", "API");

		System.out.println("=================================================");
		List<Integer> lengthOfString = courses.stream().map(str -> str.length()).collect(Collectors.toList());
		lengthOfString.stream().forEach(System.out::println);

	}

}
