package learning.functionalInterfaces;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import learning.data.Student;
import learning.data.StudentDataBase;

public class FunctionStudentExample {

	static Comparator<Student> gpaComparator = Comparator.comparing(Student::getGpa);
	/*
	 * Same as 
	 * static Comparator<Student> gpaComparator = (s1, s2) -> Double.compare(s1.getGpa(), s2.getGpa());
	 */

	static Function<List<Student>, Map<String, Double>> studentGradeMapFunction = (students -> {
		Map<String, Double> studentGradeMap = new LinkedHashMap<>();
		Collections.sort(students, gpaComparator);
		students.forEach(student -> {
			if (PredicateExample.predicateGradeStudent.test(student))
				studentGradeMap.put(student.getName(), student.getGpa());
		});

		return studentGradeMap;
	});

	public static void main(String[] args) {
		System.out.println(studentGradeMapFunction.apply(StudentDataBase.getAllStudents()));
	}

}
