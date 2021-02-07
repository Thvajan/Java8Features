package learning.optional;

import java.util.Optional;

public class OptionalPresentExample {

	public static void main(String[] args) {
		Optional<String> studentNameOptional = Optional.ofNullable("Hi");
		if (studentNameOptional.isPresent()) {
			System.out.println("Student Name: " + studentNameOptional.get());
		} else {
			System.out.println("No Data");
		}

		studentNameOptional.ifPresent(System.out::println);
	}
}
