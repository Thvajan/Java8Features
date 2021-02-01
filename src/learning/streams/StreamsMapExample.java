package learning.streams;

import static java.util.stream.Collectors.toSet;

import java.util.Set;

import learning.data.Student;
import learning.data.StudentDataBase;

public class StreamsMapExample {

	public static Set<String> namesList() {
		return StudentDataBase.getAllStudents().stream().map(Student::getName).map(String::toLowerCase)
				.collect(toSet());
	}

	public static void main(String[] args) {
		Set<String> namesList = namesList();
		System.out.println(namesList);
	}

}
