package learning.functionalInterfaces;

import java.util.List;
import java.util.function.Consumer;

import learning.data.Student;
import learning.data.StudentDataBase;

public class ConsumerExample {

	static Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
	static Consumer<Student> consumer = (s) -> System.out.println(s.getName());
	static Consumer<Student> consumerName = (s) -> System.out.print(s.getName() + ": ");
	static Consumer<Student> consumerActivities = (s) -> System.out.println(s.getActivities());

	public static void main(String[] args) {

		c1.accept("Student detaiLS:");
		System.out.println();
		printName();
		printNameAndActivities();
		printNameAndActivitiesWithCondition();
	}

	static void printName() {
		System.out.println("printName:");
		List<Student> allStudents = StudentDataBase.getAllStudents();
		allStudents.forEach(consumer);
		System.out.println();
	}

	static void printNameAndActivities() {
		System.out.println("printNameAndActivities:");
		List<Student> allStudents = StudentDataBase.getAllStudents();
		allStudents.forEach(consumerName.andThen(consumerActivities));
		System.out.println();
	}

	static void printNameAndActivitiesWithCondition() {
		System.out.println("printNameAndActivitiesWithCondition:");
		List<Student> allStudents = StudentDataBase.getAllStudents();
		allStudents.forEach((student -> {
			if (student.getGradeLevel() >= 3 && student.getGpa() >= 3.9)
				consumerName.andThen(consumerActivities).accept(student);
		}));
		System.out.println();
	}
}
