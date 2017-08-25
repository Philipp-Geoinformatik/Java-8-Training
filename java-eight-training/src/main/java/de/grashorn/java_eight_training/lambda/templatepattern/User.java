package de.grashorn.java_eight_training.lambda.templatepattern;

public class User {
	String name;
	Integer age;
	public User(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public EntityValidator validateName() {
		return () -> name.isEmpty();
	}
}
