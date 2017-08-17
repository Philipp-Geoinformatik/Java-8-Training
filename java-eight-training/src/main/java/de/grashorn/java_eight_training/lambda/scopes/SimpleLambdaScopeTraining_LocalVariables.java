package de.grashorn.java_eight_training.lambda.scopes;

import de.grashorn.java_eight_training.functionalinterface.TypeConverter;

public class SimpleLambdaScopeTraining_LocalVariables {
	public static void main(String[] args) {
		// outer scope with final declaration
		final int num = 10 ; 
		TypeConverter<Integer, String> stringConverter = (from) -> String.valueOf(from + num);
		String a = stringConverter.convertTo(2);
		System.out.println(a);
		//outer scope without final declaration (THE DECLARATION ISN'T NEEDED)--> also valid!!!
		int num2 = 20;
		TypeConverter<Integer, String> stringConverter2 = (from2) -> String.valueOf(from2 + num2);
		String a2 = stringConverter2.convertTo(2);
		System.out.println(a2);
		// However num must be implicitly final for the code to compile. The following code does not compile:
		//num2 = 4; // THIS ISN'T ALLOWED!
	}
}
