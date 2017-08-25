package de.grashorn.java_eight_training.comsumer;

import java.util.function.Consumer;

public class SimpleConsumerTest {

	
	public static void printNames(String name){
		System.out.println(name);
		
	}
	
	public static void main(String[] args) {
		Consumer<String> consumer = SimpleConsumerTest::printNames;
		consumer.accept("sdf");
		consumer.accept("234");
		consumer.accept("sdfsdfsdf");
	}
}
