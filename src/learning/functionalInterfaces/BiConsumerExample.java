package learning.functionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;

import learning.data.Student;
import learning.data.StudentDataBase;

public class BiConsumerExample {

	public static void main(String[] args) {
		BiConsumer<String, String> biConsumer = (a, b) -> {
			System.out.println("First: " + a + " Second: " + b);
		};
		biConsumer.accept("Learning", "Experience");

		BiConsumer<Integer, Integer> biConsumerMultiply = (a, b) -> {
			System.out.println("Multiply: " + a * b);
		};

		BiConsumer<Integer, Integer> biConsumerDivide = (a, b) -> {
			System.out.println("Divide: " + a / b);
		};

		biConsumerMultiply.andThen(biConsumerDivide).accept(55, 5);
		
		printNameAndActivities();
	}

	static void printNameAndActivities() {
		System.out.println("printNameAndActivities:");
		List<Student> allStudents = StudentDataBase.getAllStudents();
		BiConsumer<String, List<String>> biConsumer = (name, activities) -> {
			System.out.println(name + ": " + activities);
		};
		allStudents.forEach((student -> biConsumer.accept(student.getName(), student.getActivities())));
		System.out.println();
	}

}
