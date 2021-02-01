package learning.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import learning.data.StudentOld;

public class StreamsExample {

	public static void main(String[] args) {
		Predicate<StudentOld> agePredicate = (student) -> {
			return (student.getAge() >= 20 && student.getAge() <= 30);
		};
		Predicate<StudentOld> genderPredicate = (student) -> student.getGender().equals("Female");
		Map<String, Integer> studentNameAgeMap = createAndFetchStudents().stream().filter(agePredicate)
				.filter(genderPredicate)
				.collect(Collectors.toMap(StudentOld::getName, StudentOld::getAge));
		System.out.println(studentNameAgeMap);
	}

	public static List<StudentOld> createAndFetchStudents() {
		List<StudentOld> students = new ArrayList<StudentOld>();
		StudentOld student = new StudentOld("Ganesh", "Male", 21, Arrays.asList("Table Tennis", "Gaming", "Singing"));
		students.add(student);
		student = student.clone();
		student.setName("Ana");
		student.setGender("Female");
		students.add(student);
		student = student.clone();
		student.setName("!Zobile");
		student.setAge(19);
		students.add(student);
		return students;
	}

}
