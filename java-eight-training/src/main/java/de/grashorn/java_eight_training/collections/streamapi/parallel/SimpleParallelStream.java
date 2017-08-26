package de.grashorn.java_eight_training.collections.streamapi.parallel;

import java.time.Duration;
import java.time.Instant;
import java.util.stream.IntStream;

public class SimpleParallelStream {

	public static void main(String[] args) {

		Instant inst = Instant.now();
		IntStream.rangeClosed(0, 100).parallel()
				.forEach(i -> System.out.println(Thread.currentThread().getName() + " " + i));
		System.out.println(Duration.between(inst, Instant.now()));
		
		inst = Instant.now();
		System.out.println("===============================");
		IntStream.rangeClosed(0, 100).parallel()
				.forEachOrdered(i -> System.out.println(Thread.currentThread().getName() + " " + i));
		System.out.println(Duration.between(inst, Instant.now()));
	}

}
