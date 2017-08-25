package de.grashorn.java_eight_training.collections.streamapi;

import java.util.ArrayList;
import java.util.Arrays;

import de.grashorn.java_eight_training.util.Person;

public class SimpleSearchAndFilter {

	public static void main(String[] args) {
		ArrayList<Person> pers = new ArrayList<Person>(Arrays.asList(new Person("Heinz", "Warns", "Airbusallee 3", 44, 2),new Person("Klaus", "Warns", "Willystraße 3", 63, 2),new Person("Bernd", "Meier", "Lessingstraße 3", 45, 2),new Person("Maya", "Stapfen", "Buchenweg 3", 45, 2)));
		pers.stream().limit(120).filter(p -> p.getAge() > 60).forEach(p-> System.out.println(p.getName()));
		
	}
}
