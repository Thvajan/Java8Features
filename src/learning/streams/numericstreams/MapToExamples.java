package learning.streams.numericstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MapToExamples {
	public static void main(String[] args) {
		System.out.println("MaptoObject: "
				+ IntStream.rangeClosed(1, 10).mapToObj(i -> new Integer(i)).collect(Collectors.toList()));
		System.out.println("mapToLong: " + IntStream.rangeClosed(1, 10).mapToLong(i -> new Long(i)).sum());
		System.out.println("mapToDouble: " + IntStream.rangeClosed(1, 10).mapToDouble(i -> i).sum());
		List<Integer> a = Arrays.asList(11, 2,5,3);
		System.out.println(a.stream().sorted().collect(Collectors.toList()));
	}
}
