package learning.streams.numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxingAndUnboxing {
	public static void main(String[] args) {
		List<Integer> boxed = IntStream.rangeClosed(0, 10).boxed().collect(Collectors.toList());
		System.out.println(boxed);
		System.out.println(boxed.stream().mapToInt(Integer::intValue).sum());
	}
}
