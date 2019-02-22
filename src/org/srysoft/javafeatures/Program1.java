package org.srysoft.javafeatures;

import java.util.List;

public class Program1 {

	/**
	 * Print all value of list using Functional Programming
	 * 
	 * @param list
	 */
	public void printWithFP(List<String> list) {
		list.stream().forEach(item -> System.out.println("item: " + item));
	}

	/**
	 * 
	 * 
	 * @param list
	 */
	public void printWithFilterFP(List<String> list) {
		list.stream().filter(element -> element.endsWith("at"))
						.forEach(item -> System.out.println("item: " + item));
	}
}
