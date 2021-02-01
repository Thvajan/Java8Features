package learning.streams;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import learning.data.Student;
import learning.data.StudentDataBase;

public class StreamsExample2 {

	public static void main(String[] args) {
		
		Map<String, List<String>> studentActivitiesMap = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.toMap(Student::getName, Student::getActivities));
		
		Predicate<Student> gradeGTE4Filter = (student) -> student.getGradeLevel() >= 3;
		
		Predicate<Student> gpaGTE3_9Filter = (student) -> student.getGpa() >= 3.9;
		
		Map<String, List<String>> filteredStudentActivitiesMap = StudentDataBase.getAllStudents().stream()
				.peek(System.out::println)
				.filter(gradeGTE4Filter.and(gpaGTE3_9Filter))
				.peek((student)->System.out.println("Post Filter:"+student))
				.collect(Collectors.toMap(Student::getName, Student::getActivities));

		BiConsumer<? super String, ? super List<String>> printNameNActivities = (student, acticities) -> System.out
				.println(student + " : " + acticities);

		System.out.println("All Students: ");
		studentActivitiesMap.forEach(printNameNActivities);
		System.out.println("\nStudents with Grade level >= 4: ");
		filteredStudentActivitiesMap.forEach(printNameNActivities);
	}

}
