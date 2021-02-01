package learning.streams;

import java.util.Optional;

import learning.data.Student;
import learning.data.StudentDataBase;

public class StreamsFindExample {

	public static void main(String[] args) {
		Optional<Student> findFirst = findFirst();

		if (findFirst.isPresent())
			System.out.println("findFirst: " + findFirst);
		else
			System.out.println("Found none");

		Optional<Student> findAny = findAny();

		if (findAny.isPresent())
			System.out.println("findAny: " + findAny);
		else
			System.out.println("Found none");

	}

	public static Optional<Student> findFirst() {
		return StudentDataBase.getAllStudents().stream().filter((student) -> student.getGpa() >= 3.5).findFirst();
	}

	public static Optional<Student> findAny() {
		return StudentDataBase.getAllStudents().stream().filter((student) -> student.getGpa() > 3.50).findAny();
	}

}
