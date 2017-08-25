package de.grashorn.java_eight_training.collections.streamapi;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import de.grashorn.java_eight_training.util.Person;
import de.grashorn.java_eight_training.util.PersonFactory;

public class SimpleCombiningAndShortening {

	
	public static void main(String[] args) {
		
		ArrayList<Person> pers = PersonFactory.getPersons();
		//join every firstname to one String
		pers.stream().map(Person::getName).collect(Collectors.joining(", "));
		//filter
		pers.stream().filter(p -> p.getName().startsWith("B")).map(p -> p.getName() + " has won a price").forEach(System.out::println);;
		//skipping
		IntStream.rangeClosed(1, 100).skip(90).forEach(p -> System.out.print(p + ", "));
		System.out.println();
		//
		IntStream.iterate(2, zahl -> zahl * zahl).limit(5).forEach(s -> System.out.print(s + ", "));
		// reduce
		System.out.println("\nReduce: Summerize the first 100 positive numbers -> gauss");
		IntStream.rangeClosed(0, 100).reduce((a,b) -> a+b).ifPresent(System.out::println);
	}
	
}
