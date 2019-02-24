package org.srysoft.javafeatures;

import java.util.Collections;
import java.util.List;

import org.srysoft.javafeatures.bean.Person;

public class Exercise1 {

	public void printAll(List<Person> people) {
		people.stream().forEach(p -> System.out.println(p));
	}

	public void sortByLastName(List<Person> people) {
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
		//printAll(people);
		printConditionally(people, p -> true);
	}

	public void fetchAllPeopleLastNameBeginWith_C(List<Person> people) {
		printConditionally(people, p -> p.getLastName().startsWith("C"));
	}

	public void fetchAllPeopleFirstNameBeginWith_C(List<Person> people) {
		printConditionally(people, p -> p.getFirstName().startsWith("C"));
	}

	private void printConditionally(List<Person> people, Condition condition) {
		for (Person person : people) {
			if (condition.test(person)) {
				System.out.println(person);
			}
		}

	}

}

interface Condition {
	boolean test(Person person);
}
