package de.grashorn.java_eight_training.functionalinterface.lazyness;

import java.util.function.UnaryOperator;

@FunctionalInterface
public interface IntermittentString {

	public IntermittentString transform(UnaryOperator<String> op);

}
