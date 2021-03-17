package learning.streams.terminalOps;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import learning.data.Student;
import learning.data.StudentDataBase;

public class GroupingByExample {

	public static Map<String, List<Student>> groupStudentsByGender() {
		Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGender));
		return studentMap;
	}

	public static Map<String, List<Student>> groupStudentsByCustomLogic() {
		Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "Outstanding" : "Good"));
		return studentMap;
	}

	public static Map<Integer, Map<String, List<Student>>> twoLevelGrouping() {
		Map<Integer, Map<String, List<Student>>> studentMap = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel,
						Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "Outstanding" : "Good")));
		return studentMap;
	}

	public static void twoLevelGrouping2() {
		Map<Integer, Integer> studentMap = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.summingInt(Student::getNotebooks)));
		System.out.println(studentMap);
	}

	public static void main(String[] args) {
		System.out.println("groupStudentsByGender: ");

		/*
		 * Map<String, List<Student>> groupStudentsByGender = groupStudentsByGender();
		 * groupStudentsByGender.forEach((gender, students) -> System.out.println(gender
		 * + ": " + students));
		 * 
		 * Map<String, List<Student>> groupStudentsByCustomLogic =
		 * groupStudentsByCustomLogic(); groupStudentsByCustomLogic.forEach((category,
		 * students) -> System.out.println(category + ": " + students));
		 * 
		 * Map<Integer, Map<String, List<Student>>> twoLevelGrouping =
		 * twoLevelGrouping(); twoLevelGrouping.forEach((grade, map) ->
		 * System.out.println(grade + ": " + map));
		 */

		twoLevelGrouping2();
	}
}
