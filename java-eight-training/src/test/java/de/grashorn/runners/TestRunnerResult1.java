package de.grashorn.runners;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import de.grashorn.java_eight_training.TestResultClass1;

public class TestRunnerResult1 {
	
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestResultClass1.class);

		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
			System.out.println("Failures printed");
		}

		System.out.println(result.wasSuccessful());
	}
}