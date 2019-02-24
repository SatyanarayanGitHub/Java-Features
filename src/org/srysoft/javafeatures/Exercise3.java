package org.srysoft.javafeatures;

import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import org.srysoft.javafeatures.bean.Person;

public class Exercise3 {

	public void printAll(List<Person> people) {
		people.stream().forEach(p -> System.out.println(p));
	}

	public void sortByLastName(List<Person> people) {
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
		//printAll(people);
		performConditionally(people, p -> true, p -> System.out.println(p));
	}

	public void fetchAllPeopleLastNameBeginWith_C(List<Person> people) {
		performConditionally(people, p -> p.getLastName().startsWith("C"), p -> System.out.println(p));
	}

	public void fetchAllPeopleFirstNameBeginWith_C(List<Person> people) {
		performConditionally(people, p -> p.getFirstName().startsWith("C"),
				p -> System.out.println(p.getFirstName() + " " + p.getLastName()));
	}

	/**
	 * Use Consumer features
	 * 
	 * @param people
	 * @param predicate
	 * @param consumer
	 */
	private void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for (Person person : people) {
			if (predicate.test(person)) {
				consumer.accept(person);
			}
		}

	}

}
