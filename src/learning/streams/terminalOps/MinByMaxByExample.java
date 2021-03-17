package learning.streams.terminalOps;

import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import learning.data.Student;
import learning.data.StudentDataBase;

public class MinByMaxByExample {

	public static Optional<Student> minByExample() {
		return StudentDataBase.getAllStudents().stream()
				.collect(Collectors.minBy(Comparator.comparing(Student::getGradeLevel)));
	}

	public static Optional<Student> minByManualSort() {
		return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getGradeLevel))
				.findFirst();
	}

	public static Optional<Student> maxByExample() {
		return StudentDataBase.getAllStudents().stream()
				.collect(Collectors.maxBy(Comparator.comparing(Student::getGradeLevel)));
	}

	public static Optional<Student> maxByManualSort() {
		return StudentDataBase.getAllStudents().stream().sorted((s, st) -> st.getGradeLevel() - s.getGradeLevel())
				.findFirst();
	}

	public static void main(String[] args) {
		System.out.println("MinBy: " + minByExample().get());
		System.out.println("MaxBy: " + maxByExample().get());
		
		System.out.println("minByManualSort: " + minByManualSort().get());
		System.out.println("maxByManualSort: " + maxByManualSort().get());
		
		Integer[] a = {12,3,5,2};
		System.out.println(Stream.of(a).sorted().findFirst().get());
	}
}
