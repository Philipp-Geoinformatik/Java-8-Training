package de.grashorn.java_eight_training.collections.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import de.grashorn.java_eight_training.util.Person;
import de.grashorn.java_eight_training.util.PersonFactory;

public class SimpleAggregation {

	public static void main(String[] args) {
		ArrayList<Person> pers = PersonFactory.getPersons();
		// maximal age
		pers.stream().max((p1, p2) -> p1.getAge() - p2.getAge()).ifPresent(System.out::print);
		//
		System.out.println("\nMax");
		IntStream.rangeClosed(1, 2).map((i) -> Double.valueOf(Math.random() * 100).intValue()).max()
				.ifPresent(System.out::print);
		System.out.println("");
		//
		String streets = pers.stream().map(Person::getAddress).distinct().collect(Collectors.joining(", "));
		System.out.println(streets);
		// Sort persons by comparator
		pers.stream().sorted().forEach(System.out::println);
		System.out.println(pers.stream().count());
		//
		pers.stream().distinct().collect(Collectors.groupingBy(Person::getAge, Collectors.counting()))
				.forEach((age, count) -> System.out.println(age + " occourance" + count));
		//
		pers.stream().collect(Collectors.groupingBy(Person::getAge, Collectors.counting())).entrySet().stream().max(Comparator.comparingInt(e -> e.getValue().intValue())
				).ifPresent(System.out::println);
	}

}
