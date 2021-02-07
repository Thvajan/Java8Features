package learning.optional;

import java.util.Optional;

import learning.data.Bike;
import learning.data.Student;
import learning.data.StudentDataBase;

public class OptionalMapFlatMapExample {

	public static void main(String[] args) {
		optionalFilter();
		optionalMap();
		optionalFlatMap();
	}

	private static void optionalFilter() {
		Optional<Student> studentNameOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		studentNameOptional.filter(s -> s.getGpa() >= 5.0).ifPresent(System.out::println);
	}

	private static void optionalMap() {
		Optional<Student> studentNameOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		System.out.println(studentNameOptional.filter(s -> s.getGpa() >= 3.5).map(Student::getName).get());
	}

	private static void optionalFlatMap() {
		Optional<Student> studentNameOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		System.out.println(
				studentNameOptional.filter(s -> s.getGpa() >= 3.5).flatMap(Student::getBike).map(Bike::getName).get());
	}
}
