package org.srysoft.javafeatures;

import java.util.Arrays;
import java.util.List;

import org.srysoft.javafeatures.bean.Person;
/**
 * 
 * @author SATYA
 *
 */
public class JavaBrain {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 55), new Person("Lewis", "Carrol", 42),
				new Person("Thomas", "Calyle", 51), new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39));

		//Exercise1 exe1 = new Exercise1();
		//step-1: Sort list by last name
		//exe1.printAll(people);
		//System.out.println("-----------------------------------------------------------");

		//step-2: Create a method that print all elements in the list
		//exe1.sortByLastName(people);		
		//System.out.println("-----------------------------------------------------------");

		//step-3: Create a method that prints all people that have last name beginning with C
		//exe1.fetchAllPeopleLastNameBeginWith_C(people);
		//System.out.println("-----------------------------------------------------------");

		//step-3: Create a method that prints all people that have last name beginning with C
		//exe1.fetchAllPeopleFirstNameBeginWith_C(people);

		//Exercise2 exe2 = new Exercise2();
		//step-1: Sort list by last name
		//exe2.printAll(people);
		//System.out.println("-----------------------------------------------------------");

		//step-2: Create a method that print all elements in the list
		//exe2.sortByLastName(people);		
		//System.out.println("-----------------------------------------------------------");

		//step-3: Create a method that prints all people that have last name beginning with C
		//exe2.fetchAllPeopleLastNameBeginWith_C(people);
		//System.out.println("-----------------------------------------------------------");

		//step-3: Create a method that prints all people that have last name beginning with C
		//exe2.fetchAllPeopleFirstNameBeginWith_C(people);

		/*
				Exercise3 exe3 = new Exercise3();
				//step-1: Sort list by last name
				exe3.printAll(people);
				System.out.println("-----------------------------------------------------------");
		
				//step-2: Create a method that print all elements in the list
				exe3.sortByLastName(people);
				System.out.println("-----------------------------------------------------------");
		
				//step-3: Create a method that prints all people that have last name beginning with C
				exe3.fetchAllPeopleLastNameBeginWith_C(people);
				System.out.println("-----------------------------------------------------------");
		
				//step-3: Create a method that prints all people that have last name beginning with C
				exe3.fetchAllPeopleFirstNameBeginWith_C(people);
		*/

		int[] someNumbers = { 1, 2, 3, 4 };
		int key = 0;

		Exercise4 exe4 = new Exercise4();
		exe4.process(someNumbers, key);
		/*exe4.process(someNumbers, key, (v, k) -> {
				System.out.println(v + k);
		});*/

	}

}
