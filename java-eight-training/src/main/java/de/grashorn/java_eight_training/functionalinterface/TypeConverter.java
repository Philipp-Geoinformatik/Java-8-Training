package de.grashorn.java_eight_training.functionalinterface;

@FunctionalInterface
public interface TypeConverter<F, T> {
	T convertTo(F originalType);
}
