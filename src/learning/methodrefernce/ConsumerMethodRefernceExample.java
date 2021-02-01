package learning.methodrefernce;

import java.util.function.Consumer;

import learning.data.Student;
import learning.data.StudentDataBase;

public class ConsumerMethodRefernceExample {

	static Consumer<Student> consumer = System.out::println;

	static Consumer<Student> activitiesConsumer = Student::printActivities;
	
	public static void main(String[] args) {
		StudentDataBase.getAllStudents().forEach(consumer.andThen(activitiesConsumer));
	}
}
