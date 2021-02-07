package learning.streams.numericstreams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class AggregateFunctions {

	public static void main(String[] args) {
		System.out.println("Sum of given elements: " + IntStream.of(1,5,774,4,4,45,2).sum());
		System.out.println("Sum of 1 to 50: " + IntStream.rangeClosed(1, 50).sum());
		System.out.println("Max: " + IntStream.of(1,5,774,4,4,45,2).max().orElse(0));
		System.out.println("Min: " + LongStream.of(11,5,774,4,4,45,2).min().orElse(0));
		System.out.println("Avg: " + LongStream.rangeClosed(1,5).average().orElse(0));
		List<String> list = new ArrayList<String>();
		list.sort((s1,s2)->s1.compareTo(s2));
	}
}
