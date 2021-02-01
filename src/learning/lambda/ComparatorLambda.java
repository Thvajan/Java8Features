package learning.lambda;

import java.util.Comparator;

public class ComparatorLambda {

	public static void main(String[] args) {

		/* Old way */
		Comparator<Integer> comparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		};

		System.out.println("Old Comparator: " + comparator.compare(22, 23));

		/* Lambda Way */
		Comparator<Integer> comparatorLambda = (Integer a, Integer b) -> {
			return a.compareTo(b);
		};
		
		System.out.println("Lambda Comparator: " + comparatorLambda.compare(22, 23));
		
		
		/* More minimalistic Lambda Way */
		Comparator<Integer> comparatorLambda1 = (a, b) -> a.compareTo(b);
		
		System.out.println("Minimalistic Lambda Comparator: " + comparatorLambda1.compare(22, 23));
	}

}
