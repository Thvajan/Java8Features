package learning.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {

	public static void main(String[] args) {
		List<Integer> numbers =  new ArrayList<Integer>();
//		List<Integer> numbers = Arrays.asList(1,2,5,444,0,-5);
		Optional<Integer> findMaxValueOptional = findMaxValue(numbers);
		if (findMaxValueOptional.isPresent())
			System.out.println(findMaxValueOptional.get());
		else
			System.out.println("Empty list");
	}

	public static Optional<Integer> findMaxValue(List<Integer> numbers) {
		Integer reduce = numbers.stream().reduce(0, (a, b) -> a > b ? a : b);
		Optional<Integer> reduce2 = numbers.stream().reduce((a, b) -> a > b ? a : b);
		return reduce2;
	}

}
