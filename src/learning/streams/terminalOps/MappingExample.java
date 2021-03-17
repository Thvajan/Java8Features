package learning.streams.terminalOps;

import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import learning.data.Student;
import learning.data.StudentDataBase;

public class MappingExample {

	public static void main(String[] args) {
		List<String> namesList = StudentDataBase.getAllStudents().stream().collect(mapping(Student::getName, toList()));
		//same as
		//namesList = StudentDataBase.getAllStudents().stream().map(Student::getName).collect(toList());
		System.out.println("NameList: " + namesList.stream().sorted().collect(toList()));
		SortedSet<String> namesSet = new TreeSet<>(
				StudentDataBase.getAllStudents().stream().collect(mapping(Student::getName, toSet())));
		System.out.println("NameSet: " + namesSet);
	}
}
