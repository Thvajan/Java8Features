package learning.functionalInterfaces;

import java.util.List;
import java.util.function.Predicate;

import learning.data.Student;
import learning.data.StudentDataBase;

public class PredicateExample {

	static Predicate<Integer> predicate2 = (num) -> num % 2 == 0;

	static Predicate<Integer> predicate5 = (num) -> num % 5 == 0;

	static Predicate<Student> predicateGPAStudent = (student) -> student.getGpa() > 3.8;

	static Predicate<Student> predicateGradeStudent = (student) -> student.getGradeLevel() >= 3;

	public static void andPredicate() {

		System.out.println(predicate2.and(predicate5).test(3020));
	}

	public static void orPredicate() {

		System.out.println(predicate2.or(predicate5).test(30202));
	}

	public static void negatePredicate() {

		System.out.println(predicate2.or(predicate5).negate().test(30202));
	}

	public static void main(String[] args) {
//		andPredicate();
//		orPredicate();
//		negatePredicate();
//		System.out.println(predicate2.test(2558));

		filterStudentsByCGPA();
	}

	private static void filterStudentsByCGPA() {
		List<Student> allStudents = StudentDataBase.getAllStudents();
		allStudents.forEach((student) -> {
			if (predicateGPAStudent.or(predicateGradeStudent).test(student))
				System.out.println(student);
		});
	}
}
