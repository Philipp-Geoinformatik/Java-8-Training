package de.grashorn.java_eight_training.util;

import java.util.ArrayList;
import java.util.Arrays;

public class PersonFactory {

	/**
	 * 
	 * @return
	 */
	public static ArrayList<Person> getPersons() {
		ArrayList<Person> pers = new ArrayList<Person>(
				Arrays.asList(new Person("Heinz", "Warns", "Airbusallee 3", 44, 2),
						new Person("Klaus", "Warns", "Buchenallee 3", 63, 2),
						new Person("Bernd", "Meier", "Lessingstraße 3", 45, 2),
						new Person("Markus", "Schulz", "Akarzienallee 352", 35, 2),
						new Person("Maya", "Stapfen", "Buchenweg 3", 45, 2)));
		return pers;
	}

	/**
	 * 
	 * @return
	 */
	public static ArrayList<Person> getOhterPersons() {
		//
		ArrayList<Person> pers2 = new ArrayList<Person>(Arrays.asList(new Person("X", "Y", "1233", 44, 2),
				new Person("Frank", "Schumacher", "Willystraße 3", 63, 2),
				new Person("Ralf", "Hinz", "Lessingstraße 3", 35, 2),
				new Person("Sabrina", "Hempel", "Buchenweg 3", 45, 2)));
		return pers2;
	}
}
