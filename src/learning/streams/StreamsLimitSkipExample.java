package learning.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import learning.data.StudentOld;

public class StreamsLimitSkipExample {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,5,444,0,-5);
//		List<Integer> numbers =  new ArrayList<Integer>();
		System.out.println(sumLimit(numbers));
		System.out.println(sumSkip(numbers));
	}

	public static Optional<Integer> sumLimit(List<Integer> numbers) {
		return numbers.stream().limit(3).reduce(Integer::sum);
	}
	
	public static Optional<Integer> sumSkip(List<Integer> numbers) {
		return numbers.stream().skip(3).reduce(Integer::sum);
	}

}
