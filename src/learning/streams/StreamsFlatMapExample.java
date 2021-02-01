package learning.streams;

import java.util.List;
import java.util.stream.Collectors;

import learning.data.Student;
import learning.data.StudentDataBase;

public class StreamsFlatMapExample {

	public static List<String> printDistinctActivities() {
		List<String> activities = StudentDataBase.getAllStudents().stream()
				.map(Student::getActivities) // Stream of List<String>
				.flatMap(List::stream) // Stream of Strings
				.distinct()
				.sorted()
				.collect(Collectors.toList());
		return activities;
	}
	
	public static List<String> printStudentActivities() {
		List<String> activities = StudentDataBase.getAllStudents().stream()
				.map(Student::getActivities) // Stream of List<String>
				.flatMap(List::stream) // Stream of Strings
				.collect(Collectors.toList());
		return activities;
	}
	
	public static Long printDistinctActivitiesCount() {
		Long noOfDistinctActivities = StudentDataBase.getAllStudents().stream()
				.map(Student::getActivities) // Stream of List<String>
				.flatMap(List::stream)
				.distinct()
				.count();
		return noOfDistinctActivities;
	}

	public static void main(String[] args) {
		System.out.println(printDistinctActivities());
		System.out.println(printStudentActivities());
		System.out.println(printDistinctActivitiesCount());
	}

}
