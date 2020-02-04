package org.srysoft.javafeatures.service;

import java.util.ArrayList;
import java.util.List;

import org.srysoft.javafeatures.bean.Person;

public class PersonDAO {
	
	public List<Person> getPersons() {
		List<Person> persons = new ArrayList<>();
		
		persons.add(new Person("Rahul", "Jain", 30));
		persons.add(new Person("Nikhil", "Patel", 30));
		persons.add(new Person("Lalit", "Bhatt", 37));
		persons.add(new Person("Umesh", "Kumar", 30));
		persons.add(new Person("Ronak", "Yadav", 20));
		persons.add(new Person("Rohan", "Jain", 28));
		persons.add(new Person("Nilesh", "Yadav", 30));
		persons.add(new Person("Ashish", "Jain", 25));
		persons.add(new Person("Jayesh", "Jain", 36));
		persons.add(new Person("Ashish", "Parmar", 40));

		return persons;
	}

}
