package learning.functionalInterfaces;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import learning.data.Student;
import learning.data.StudentDataBase;

public class BiFunctionExample {

	static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction = ((students, studentPredicate)->{
	
		Map<String, Double> studentGradeMap = new LinkedHashMap<>();
		Collections.sort(students, FunctionStudentExample.gpaComparator);
		students.forEach(student -> {
			if (studentPredicate.test(student))
				studentGradeMap.put(student.getName(), student.getGpa());
		});
		return studentGradeMap;
	});

	public static void main(String[] args) {
		Map<String, Double> biFun = biFunction.apply(StudentDataBase.getAllStudents(), PredicateExample.predicateGPAStudent);
		System.out.println(biFun);
	}

}
