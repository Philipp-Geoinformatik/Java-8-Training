package de.grashorn.java_eight_training.buildinfunctionalinterfaces;

import java.util.Objects;
import java.util.function.Predicate;

public class SimplePredicatesTest {

	public static void main(String[] args) {
		Predicate<String> lBiggerZero = (s) -> s.length() > 0;
		lBiggerZero.test("sdf");
		lBiggerZero.negate().test("sdf");

		// nullcheck by Predicate
		Predicate<Boolean> nonNull = Objects::nonNull;
		Predicate<Boolean> isNull = Objects::isNull;
		
		Predicate<String> isEmpty = (s) -> s.isEmpty();
		Predicate<String> isEmpty2 = String::isEmpty;
	}

}
