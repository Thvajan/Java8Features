package learning.functionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

	static Comparator<Integer> comparator = (s1, s2) -> s1.compareTo(s2);

	static BinaryOperator<Integer> multiply = (s, s1) -> s * s1;

	public static void main(String[] args) {
		System.out.println(multiply.apply(5, 5));
		
		BinaryOperator<Integer> maxBy= BinaryOperator.maxBy(comparator);
		BinaryOperator<Integer> minBy= BinaryOperator.minBy(comparator);
		System.out.println("MaxBy: "+maxBy.apply(4, 5));
		System.out.println("minBy: "+minBy.apply(4, 5));
	}
}
