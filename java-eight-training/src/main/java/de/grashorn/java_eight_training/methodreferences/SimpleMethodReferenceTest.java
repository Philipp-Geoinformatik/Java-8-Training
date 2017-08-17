package de.grashorn.java_eight_training.constructorreferences;

import de.grashorn.java_eight_training.functionalinterface.TypeConverter;

public class SimpleMethodReferenceTest {

	public static void main(String[] args) {

		// defining the single abstract method by using static method references
		TypeConverter<String, Double> conv = Double::valueOf;
		Double convertedValue = conv.convertTo("234234.43");
		System.out.println(convertedValue);
		
		//
	}
}
