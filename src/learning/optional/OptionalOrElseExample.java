package learning.optional;

import java.util.Optional;

import learning.data.Student;

public class OptionalOrElseExample {

	public static String optionalOrElse() {
		Optional<Student> studentOptional = Optional.ofNullable(null);
//		Optional<Student> studentOptional = Optional.ofNullable(null);
		return studentOptional.map(Student::getName).orElse("Default");
	}

	public static String optionalOrElseGet() {
		Optional<Student> studentOptional = Optional.ofNullable(null);
//		Optional<Student> studentOptional = Optional.ofNullable(null);
		return studentOptional.map(Student::getName).orElseGet(() -> "Default");
	}

	public static String optionalOrElseThrow() {
		Optional<Student> studentOptional = Optional.ofNullable(null);
//		Optional<Student> studentOptional = Optional.ofNullable(null);
		return studentOptional.map(Student::getName).orElseThrow(() -> new RuntimeException("No Data"));
	}

	public static void main(String[] args) {
		System.out.println("optionalOrElse: " + optionalOrElse());
		System.out.println("optionalOrElseGet: " + optionalOrElseGet());
		System.out.println("optionalOrElseThrow: " + optionalOrElseThrow());
	}
}
