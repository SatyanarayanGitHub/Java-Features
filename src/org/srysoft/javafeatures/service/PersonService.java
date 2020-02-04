package org.srysoft.javafeatures.service;

import java.util.List;

import org.srysoft.javafeatures.bean.Person;
/**
 * 
 * @author SATYA
 *
 */
public class PersonService {
	PersonDAO personDAO = new PersonDAO();

	public List<Person> getAllPerson() {
		return personDAO.getPersons();
	}

}
