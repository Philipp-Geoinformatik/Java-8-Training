package de.grashorn.java_eight_training.collections.streamapi;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CollectionStreams {

	public static void main(String[] args) {
		IntStream.iterate(0, i -> i++).limit(20).forEach(System.out::print);
		System.out.println("");
		// Varying size
		Stream.builder().add("1234").add("safdgsdgsdfg").add("234324324").add("asdf")
				.add(new ArrayList<>(Arrays.asList("List 1", "List 2"))).build().forEach(System.out::println);
		// fixed size
		Stream.of(1, 2, 3, 45, 6).sorted((a, b) -> a.compareTo(b)).forEach(System.out::println);
		//
		Stream.generate(() -> Math.random() * 10).limit(6).forEach(System.out::println);
		
		
		try {
			long lines =Files.lines(Paths.get(new URI("TestFile.txt").getPath())).count();
			System.out.println(lines);
			Files.lines(Paths.get(new URI("TestFile.txt").getPath())).forEach(System.out::println);;
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}
}
