package learning.streams;

import learning.data.StudentDataBase;

public class StreamsMatchesExample {

	public static void main(String[] args) {
		System.out.println("allMatch: " + allMatch());
		System.out.println("anyMatch: " + anyMatch());
		System.out.println("noneMatch: " + noneMatch());
	}

	public static boolean allMatch() {
		return StudentDataBase.getAllStudents().stream().allMatch((student) -> student.getGpa() >= 31.5);
	}

	public static boolean anyMatch() {
		return StudentDataBase.getAllStudents().stream().anyMatch((student) -> student.getGpa() > 3.90);
	}

	public static boolean noneMatch() {
		return StudentDataBase.getAllStudents().stream().noneMatch((student) -> student.getGpa() > 3.90);
	}

}
