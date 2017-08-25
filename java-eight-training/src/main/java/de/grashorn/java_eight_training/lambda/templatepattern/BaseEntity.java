package de.grashorn.java_eight_training.lambda.templatepattern;

public abstract class BaseEntity {

	public BaseEntity(EntityValidator... entityValidators) {
		for (int i = 0; i < entityValidators.length; i++) {
			EntityValidator entityValidator = entityValidators[i];
			entityValidator.validate();
			System.out.println("validate: ");
		}
	}
}
