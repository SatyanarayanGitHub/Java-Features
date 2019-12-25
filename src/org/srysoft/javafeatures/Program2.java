package org.srysoft.javafeatures;

import java.util.List;

public class Program2 {

	public void printNumbers(List<Integer> numbers) {

		numbers.stream().forEach(element -> System.out.println(element));
	}	

	public void sumNumbers(List<Integer> numbers) {

		int sum = numbers.stream().reduce(0, (num1, num2) -> num1 + num2);
		System.out.println("Sum = " + sum);
	}

	public void sumOddNumbers(List<Integer> numbers) {
		int sum = numbers.stream().filter(num -> num % 2 == 1).reduce(0, (num1, num2) -> num1 + num2);
		System.out.println("Sum of Odd Number = " + sum);
	}

	public void sortNumbers(List<Integer> numbers) {
		numbers.stream().sorted().forEach(num -> System.out.println(num));

	}

	public void showDistinctNumber(List<Integer> numbers) {
		numbers.stream().sorted().distinct().forEach(num -> System.out.println(num));
	}

	public void showDistinctSquareNumber(List<Integer> numbers) {
		numbers.stream().sorted().distinct().map(num -> num * num).forEach(num -> System.out.println(num));
	}

}
