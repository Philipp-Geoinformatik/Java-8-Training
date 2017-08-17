package de.grashorn.java_eight_training.methodreferences;

import de.grashorn.java_eight_training.functionalinterface.TypeConverter;

public class SimpleMethodReferenceTest {

	public static void main(String[] args) {

		// defining the single abstract method by using static method references
		TypeConverter<String, Double> conv = Double::valueOf;
		Double convertedValue = conv.convertTo("234234.43");
		System.out.println(convertedValue);
		//Using the TypeConverter and AnyString object to override the method of the TypeConverter
		AnyString anyString = new AnyString();
		TypeConverter<String, String> conv2 = anyString::startsWith;
		TypeConverter<String, String> conv3 = anyString::endsWith;
		System.out.println(conv2.convertTo("dsf"));
		System.out.println(conv3.convertTo("dsasdfsdf4235234f234G"));
	}
}
