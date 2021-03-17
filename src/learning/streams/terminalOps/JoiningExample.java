package learning.streams.terminalOps;

import java.util.stream.Collectors;

import learning.data.Student;
import learning.data.StudentDataBase;

public class JoiningExample {

	public static String joining() {
		return StudentDataBase.getAllStudents().stream().map(Student::getName).collect(Collectors.joining());
	}

	public static String joiningWithDelimiters() {
		return StudentDataBase.getAllStudents().stream().map(Student::getName).collect(Collectors.joining("-"));
	}
	
	public static String joiningWithPreSuffix() {
		return StudentDataBase.getAllStudents().stream().map(Student::getName).collect(Collectors.joining("-","[","]"));
	}

	public static void main(String[] args) {
		System.out.println("joining: " + joining());
		System.out.println("joiningWithDelimiters: " + joiningWithDelimiters());
		System.out.println("joiningWithPreSuffix: " + joiningWithPreSuffix());
	}
}
