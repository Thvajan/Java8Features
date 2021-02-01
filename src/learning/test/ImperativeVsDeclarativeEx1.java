package learning.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVsDeclarativeEx1 {

	public static void main(String[] args) {

		List<Integer> intList = Arrays.asList(1, 2, 2, 3, 3, 3, 5, 5, 4, 1, 1, 4, 5);

		/* Imperative Approach */
		List<Integer> uniqueList = new ArrayList<Integer>();
		for (Integer num : intList) {
			if (!uniqueList.contains(num)) {
				uniqueList.add(num);
			}
		}
		System.out.println("Imperative Approach: " + uniqueList);

		/* Declarative Approach */
		List<Integer> uniqueList1 = intList.stream().distinct().collect(Collectors.toList());

		System.out.println("Declarative Approach: " + uniqueList1);
	}
}
