package org.srysoft.functionalprogramming;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import org.srysoft.javafeatures.bean.Person;
import org.srysoft.javafeatures.bean.PersonDTO;
import org.srysoft.javafeatures.service.PersonService;

public class PF01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonService perservice = new PersonService();

		List<Person> allPerson = perservice.getAllPerson();

		//transferPersonToDTO(allPerson);

		PF01 pf01 = new PF01();

		pf01.showHashMap();

	}

	private static void transferPersonToDTO(List<Person> allPerson) {

		List<PersonDTO> collect = allPerson.stream().map(PersonDTO::new).collect(Collectors.toList());

	}

	private void showHashMap() {
		HashMap<String, Integer> map = new HashMap<>();

		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);

		Consumer<Map.Entry<String, Integer>> action = System.out::println;

		map.entrySet().forEach(action);

		Consumer<String> actionOnKeys = System.out::println;

		map.keySet().forEach(actionOnKeys);

		Consumer<Integer> actionOnValues = System.out::println;

		map.values().forEach(actionOnValues);
	}

}
