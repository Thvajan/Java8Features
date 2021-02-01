package learning.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import learning.data.StudentOld;

public class StreamsGenerateIterateExample {

	public static void main(String[] args) {
		System.out.println(Runtime.getRuntime().availableProcessors());
		
		Stream<String> of = Stream.of("Raghav","Sekar","Vishakha","Priya","Revathi");
		of.forEach(System.out::println);
		Stream<Integer> iterate = Stream.iterate(2, (a)->a*10);
		iterate.limit(9).forEach(System.out::println);
		Supplier<Integer> numSupplier = new Random()::nextInt;
		Stream<Integer> generate = Stream.generate(numSupplier);
		generate.limit(5).forEach(System.out::println);
	} 


}
