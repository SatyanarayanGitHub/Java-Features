package org.srysoft.javafeatures.bean;

public class PersonDTO {

	private String firstName;
	private String lastName;
	private String fullName;
	private int age;
	
	

	public PersonDTO(Person person) {
		this.firstName = person.getFirstName();
		this.lastName = person.getLastName();
		//this.fullName = person.getFirstName() + " " + person.getLastName();
		this.age = person.getAge();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "PersonDTO [firstName=" + firstName + ", lastName=" + lastName + ", fullName=" + fullName + ", age="
				+ age + "]";
	}

}
