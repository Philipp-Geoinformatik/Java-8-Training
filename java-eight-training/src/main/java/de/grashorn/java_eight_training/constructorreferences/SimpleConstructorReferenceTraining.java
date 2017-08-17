package de.grashorn.java_eight_training.constructorreferences;

import java.util.ArrayList;
import java.util.List;

public class SimpleConstructorReferenceTraining {
	/**
	 * Testing constructor references
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		PersonFactory<Person> personFactory = Person::new;
		Person person = personFactory.create("Hans", "im Pech");
		System.out.println(person);
		List<Person> myTeam = new ArrayList<Person>();
		// filling the Team
		for (int i = 0; i < 5; i++) {
			myTeam.add(personFactory.create("Peter" + i, "Parker"));
		}
		myTeam.forEach(System.out::println);
	}
}
