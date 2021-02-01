package learning.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import learning.data.Student;
import learning.data.StudentDataBase;

public class StreamComparatorExample {

	public static List<Student> sortStudentsBy(String mode) {
		List<Student> result = null;
		Comparator<Student> compare = null;
		if (mode.equalsIgnoreCase("name")) {
			compare = Comparator.comparing(Student::getName);
		} else if (mode.equalsIgnoreCase("gpa")) {
			compare = Comparator.comparing(Student::getGpa);
		}
		result = StudentDataBase.getAllStudents().stream().sorted(compare).collect(Collectors.toList());
		return result;
	}

	public static List<Student> sortStudentsDescBy(String mode) {
		List<Student> result = null;
		Comparator<Student> compare = null;
		if (mode.equalsIgnoreCase("name")) {
			compare = Comparator.comparing(Student::getName);
		} else if (mode.equalsIgnoreCase("gpa")) {
			compare = Comparator.comparing(Student::getGpa);
		}
		result = StudentDataBase.getAllStudents().stream().sorted(compare.reversed()).collect(Collectors.toList());
		return result;
	}

	public static void main(String[] args) {
		System.out.println("Sorted Desc by Name:\n");
		sortStudentsDescBy("name").forEach(System.out::println);
		System.out.println("\nSorted Desc by GPA:\n");
		sortStudentsDescBy("gpa").forEach(System.out::println);
	}
}
