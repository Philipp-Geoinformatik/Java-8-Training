package de.grashorn.java_eight_training.collections.streamapi;

import java.util.ArrayList;
import java.util.stream.Stream;

import de.grashorn.java_eight_training.util.Person;
import de.grashorn.java_eight_training.util.PersonFactory;

public class SimpleStreamTransformation {

	public static void main(String[] args) {
		//
		ArrayList<Person> pers = PersonFactory.getOhterPersons();
		ArrayList<Person> pers2 = PersonFactory.getOhterPersons();

		pers.stream().map(p -> p.getName() + " " + p.getLastName() + " [" + p.getAge() + "]").forEach(System.out::println);
		System.out.println("Flatmap");
		//
		Stream.of(pers, pers2).flatMap(l -> l.stream()).forEach(p -> System.out.print(p.getName() + ", "));
		// Merged lists output
		Stream.of(pers,pers2).flatMap(pers12 -> pers12.stream().map( p -> p.getName() +" - "+ p.getLastName())).forEach(System.out::println);
		
	}

}
