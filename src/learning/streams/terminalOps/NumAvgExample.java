package learning.streams.terminalOps;

import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import learning.data.Student;
import learning.data.StudentDataBase;

public class NumAvgExample {

	static Predicate<? super Student> predicate = s->s.getGradeLevel()>3;
	public static int sum() {
		
		Stream.of(new Integer[] {1,2,3}).reduce(0,Integer::sum);
		return StudentDataBase.getAllStudents().stream().filter(predicate).collect(Collectors.summingInt(Student::getNotebooks));
	}

	public static Double avg() {
		return StudentDataBase.getAllStudents().stream().filter(predicate).collect(Collectors.averagingInt(Student::getNotebooks));
	}

	public static void main(String[] args) {
		System.out.println("Sum of all Student Notebooks: " + sum());
		System.out.println("Average of all Student Notebooks: " + avg());
	}
}
