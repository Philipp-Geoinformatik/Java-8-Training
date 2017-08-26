package de.grashorn.java_eight_training.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import de.grashorn.java_eight_training.util.Person;
import de.grashorn.java_eight_training.util.PersonFactory;

public class SimpleResults {

	public static void main(String[] args) {
		List<Person> persons = PersonFactory.getPersons();
		Person[] personsArray = persons.stream().filter(p -> p.getAddress().startsWith("A")).toArray(Person[]::new);
		for ( Person person : personsArray) {
			
			System.out.println(person.getName() + " lives in the street '" + person.getAddress() + "'" );
		}
		// make a list of persons with toList();
		List<Person> pList = persons.stream().filter(pers -> pers.getLastName().startsWith("M")).collect(Collectors.toList());
		System.out.println(pList);
		//
		List<Person> pList2 = persons.stream().filter(pers -> pers.getLastName().startsWith("H")).collect(Collectors.toCollection(ArrayList::new));
		System.out.println(pList2);
	}

}
