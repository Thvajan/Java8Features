package learning.streams.terminalOps;

import java.util.stream.Collectors;

import learning.data.StudentDataBase;

public class CountingExample {

	public static Long counting() {
		return StudentDataBase.getAllStudents().stream().filter(s->s.getActivities().size()>3).collect(Collectors.counting());
	}

	public static void main(String[] args) {
		System.out.println("Student Count: " + counting());
	}
}
