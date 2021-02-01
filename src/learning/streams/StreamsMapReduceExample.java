package learning.streams;

import learning.data.Student;
import learning.data.StudentDataBase;

public class StreamsMapReduceExample {

	public static int noOfNotebooks() {
		int noOfNotebooks = StudentDataBase.getAllStudents().stream()
				.filter((student)->student.getGradeLevel()>3)
				.filter((student)->student.getGender().equals("female"))
				.map(Student::getNotebooks)
				//.reduce(0, (a, b) -> a + b);
				.reduce(0, Integer::sum);
		return noOfNotebooks;
	}

	public static void main(String[] args) {
		System.out.println("noOfNotebooks: " + noOfNotebooks());
	}

}
