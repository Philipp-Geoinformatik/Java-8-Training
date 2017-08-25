package de.grashorn.java_eight_training.util;

public class Person implements Comparable<Person> {

	private String name;
	private String lastName;
	String address;
	private Integer age;
	Integer children;
	public Person(String name, String lastName, String address, Integer age, Integer children) {
		super();
		this.setName(name);
		this.setLastName(lastName);
		this.address = address;
		this.setAge(age);
		this.children = children;
	}

	// Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {

		return name + " " + lastName + " Age: " + age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Comparing persons by age
	 */
	@Override
	public int compareTo(Person o) {
		return this.age - o.age;
	}
}
