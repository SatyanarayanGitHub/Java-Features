package org.srysoft.javafeatures;

import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

import org.srysoft.javafeatures.bean.Person;

public class Exercise2 {

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

	private void printConditionally(List<Person> people, Predicate<Person> predicate) {
		for (Person person : people) {
			if (predicate.test(person)) {
				System.out.println(person);
			}
		}

	}

}

/**
 * We can give interface name any thing here
 */
/*
interface Foo {
	boolean test(Person person);
}
*/
