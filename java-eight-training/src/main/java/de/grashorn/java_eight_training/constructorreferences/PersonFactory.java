package de.grashorn.java_eight_training.constructorreferences;


public interface PersonFactory<P extends Person> {

	P create(String firstName, String lastName);
}
