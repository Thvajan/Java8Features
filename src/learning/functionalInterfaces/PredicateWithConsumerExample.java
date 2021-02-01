package learning.functionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

import learning.data.Student;
import learning.data.StudentDataBase;

public class PredicateWithConsumerExample {

	Predicate<Student> predicateGPAStudent = (student) -> student.getGpa() >= 3.9;

	Predicate<Student> predicateGradeStudent = (student) -> student.getGradeLevel() >= 3;

	BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> System.out
			.println(name + ": " + activities);

	BiPredicate<Integer, Double> gradeGPAFilter = (grade, gpa) -> grade >= 3 && gpa > 3.8;

	Consumer<Student> studentConsumer = (student -> {
//		if (predicateGPAStudent.and(predicateGradeStudent).test(student))
		if (gradeGPAFilter.test(student.getGradeLevel(), student.getGpa()))
			studentBiConsumer.accept(student.getName(), student.getActivities());
	});

	public void printNameAndActivities(List<Student> allStudents) {
		allStudents.forEach(studentConsumer);
	}

	public static void main(String[] args) {
		List<Student> allStudents = StudentDataBase.getAllStudents();
		new PredicateWithConsumerExample().printNameAndActivities(allStudents);
	}

}
