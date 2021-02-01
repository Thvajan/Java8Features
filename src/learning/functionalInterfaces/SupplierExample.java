package learning.functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import learning.data.Student;
import learning.data.StudentDataBase;

public class SupplierExample {

	public static Supplier<Student> studentSupplier = () -> {
		return new Student("Joe", 4, 9.0, "Male", Arrays.asList("Dancing", "Loving", "Being lost"));
	};

	public static void main(String[] args) {

		Supplier<List<Student>> students = () -> StudentDataBase.getAllStudents();
		System.out.println("New Student: " + studentSupplier.get());
		System.out.println("All Students: " + students.get());
	}
}
