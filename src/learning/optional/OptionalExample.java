package learning.optional;

import java.util.Optional;

import learning.data.Student;
import learning.data.StudentDataBase;

public class OptionalExample {

	public static String getStudentName() {
//		Student student = StudentDataBase.studentSupplier.get();
		Student student = null;
		return student == null ? null : student.getName();
	}

	//Optional.of always expects a non null input.if input is null, throws NullPointerException
	public static Optional<String> getStudentNameOptional() {
		Optional<Student> studentOptional = Optional.of(StudentDataBase.studentSupplier.get());
		if (studentOptional.isPresent())
			return studentOptional.map(Student::getName);
		return Optional.empty();
	}

	//Optional.ofNullable returns empty if input is null, else gives element
	public static Optional<String> getStudentNameOptionalofNullable() {
		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		return studentOptional.map(Student::getName);
	}

	public static void main(String[] args) {
		Optional<String> studentNameOptional = getStudentNameOptional();
		if (studentNameOptional.isPresent()) {
			System.out.println("Student Name length: " + studentNameOptional.get().length());
		}
	}
}
