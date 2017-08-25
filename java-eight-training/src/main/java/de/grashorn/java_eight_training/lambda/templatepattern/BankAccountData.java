package de.grashorn.java_eight_training.lambda.templatepattern;

public class BankAccountData extends BaseEntity {

	public BankAccountData(User user) {
		super(() -> user.age > 29, () -> !user.name.isEmpty());
	}

	public static void main(String[] args) {
		BankAccountData b = new BankAccountData(new User("Heinz", 55));
	}

}
