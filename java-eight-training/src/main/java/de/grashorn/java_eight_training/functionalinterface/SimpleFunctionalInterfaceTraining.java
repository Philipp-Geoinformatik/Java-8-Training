package de.grashorn.java_eight_training.functionalinterface;

public class SimpleFunctionalInterfaceTraining {

	public static void main(String[] args) {

		TypeConverter<String, Double> converter = (from) -> Double.valueOf(from);
		Double value = converter.convertTo("132.234");
		System.out.println(value);
	}

}
