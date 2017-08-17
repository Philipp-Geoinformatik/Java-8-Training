package de.grashorn.java_eight_training.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SimpleCollectionTraining {

	/**
	 * 
	 * @param names
	 */
	public void sortList_J7(List<String> names) {
		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			};
		});
	}

	/**
	 * Shorter in Java 8 Lambda with return types and return
	 * 
	 * @param names
	 */
	public void sortList_J8_1(List<String> names) {
		Collections.sort(names, (String a, String b) -> {
			return a.compareTo(b);
		});
	}

	/**
	 * Shorter in Java 8 Lambda without types and return PLANE Lambda expression
	 * 
	 * @param names
	 */
	public void sortList_J8_2(List<String> names) {
		Collections.sort(names, (a, b) -> a.compareTo(b));
	}

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Peter", "Anna", "Maja", "Henry", "Kevin");
	}
}
