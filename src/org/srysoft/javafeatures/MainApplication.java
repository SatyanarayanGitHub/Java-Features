package org.srysoft.javafeatures;

import java.util.ArrayList;
import java.util.List;

public class MainApplication {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<String>();
		list1.add("Apple");
		list1.add("Bat");
		list1.add("Cat");
		list1.add("Dog");
		list1.add("Elephant");
		list1.add("Fish");
		list1.add("Goat");
		
		Program1 prog1 = new Program1();
		//prog1.printWithFP(list1);
		prog1.printWithFilterFP(list1);
		
		
		
		

	}

}
