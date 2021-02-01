package learning.methodrefernce;

import java.util.function.Function;
import java.util.function.Supplier;

import learning.data.Student;

public class ConstructorReference {

	static Supplier<Student> newStudent = Student::new;

	static Function<String, Student> newStudentWithName = Student::new;

	public static void main(String[] args) {
		System.out.println(newStudent.get());
		System.out.println(newStudentWithName.apply("Parasuram"));
	}
}
