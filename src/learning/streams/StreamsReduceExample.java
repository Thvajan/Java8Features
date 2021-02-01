package learning.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import learning.data.Student;
import learning.data.StudentDataBase;

public class StreamsReduceExample {

	public static int multiply(List<Integer> numbers) {
		return numbers.stream().reduce(1, (a, b) -> a * b);
	}

	public static Optional<Integer> multiplyWOIdentity(List<Integer> numbers) {
		return numbers.stream().reduce((a, b) -> a * b);
	}

	public static Optional<Student> getHighestGPAStudent() {
		return StudentDataBase.getAllStudents().stream().reduce((s1, s2) -> (s1.getGpa() > s2.getGpa()) ? s1 : s2);
	}

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 5, 4, 2);
		System.out.println(multiply(numbers));
		Optional<Integer> multiplyWOIdentity = multiplyWOIdentity(new ArrayList<>());
		System.out.println(multiplyWOIdentity.isPresent());
		if (multiplyWOIdentity.isPresent())
			System.out.println(multiplyWOIdentity.get());

		Optional<Student> getHighestGPAStudent = getHighestGPAStudent();
		if (getHighestGPAStudent.isPresent())
			System.out.println(getHighestGPAStudent.get());
	}

}
