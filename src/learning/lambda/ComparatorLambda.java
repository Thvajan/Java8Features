package learning.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import learning.data.Student;
import learning.data.StudentDataBase;

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
		Comparator<Student> comparatorStudent = Comparator.comparing(Student::getName);
		System.out.println(StudentDataBase.getAllStudents().stream().sorted(comparatorStudent.reversed())
				.collect(Collectors.toMap(Student::getName, s -> s)));

		System.out.println("Filter:" + StudentDataBase.getAllStudents().stream().filter(s -> s.getName().endsWith("eas")).map(Student::getName)
				.findAny().orElseGet(() -> "Not Found"));

		System.out.println("Minimalistic Lambda Comparator: " + comparatorLambda1.compare(22, 23));

		List<String> names = new ArrayList<>();
		names.add("ACB");
		names.add("ABC");
		names.add("PQR");
		names.add("CDQ");
		System.out.println("Before Sorting : " + names);
		Collections.sort(names);
		System.out.println("After Sorting in Desc Order : " + names);

		int a[] = { 1, 5, 2, 4, 5, 55, 84, 4 };
		Arrays.asList(a);
		Integer[] boxedIntArray = Arrays.stream(a).boxed().toArray(Integer[]::new);
		List<Integer> list = IntStream.of(a).boxed().collect(Collectors.toList());
		System.out.println(list);
	}

}
