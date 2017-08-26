package de.grashorn.java_eight_training.datetimeapi;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.stream.Stream;

public class SimpleDateTimeInstances {

	public static void main(String[] args) {
		
		Stream.builder().add(LocalDate.now()).add(LocalTime.now()).add(LocalDateTime.now()).add(Instant.now()).build().forEach(System.out::println);
	}
	
	
}
