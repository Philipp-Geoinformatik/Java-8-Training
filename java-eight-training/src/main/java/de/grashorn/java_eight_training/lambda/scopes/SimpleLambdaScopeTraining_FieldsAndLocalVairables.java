package de.grashorn.java_eight_training.lambda.scopes;

import de.grashorn.java_eight_training.functionalinterface.TypeConverter;

/**
 * In contrast to local variables we have both read and write access to
 * instance fields and static variables from within lambda expressions. This
 * behavior is well known from anonymous objects.
 * 
 * @author ph2171
 *
 */

public class SimpleLambdaScopeTraining_FieldsAndLocalVairables {
	static int outerStaticNum;
	int outerNum;

	void testScopesOuterNum() {
		TypeConverter<Integer, String> stringConverter1 = (from) -> {
			outerNum = 23;
			return String.valueOf(from);
		};
		System.out.println(stringConverter1.convertTo(2));
	}

	void testScopesOuterStaticNum() {
		TypeConverter<Integer, String> stringConverter2 = (from) -> {
			outerStaticNum = 72;
			return String.valueOf(from);
		};
		System.out.println();
	}
}
