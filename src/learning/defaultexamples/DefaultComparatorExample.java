package learning.defaultexamples;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import learning.data.Student;
import learning.data.StudentDataBase;

public class DefaultComparatorExample {

	static Consumer<Student> studentPrinterConsumer = student -> System.out.println(student);
	static Comparator<Student> nameComparator = (s1,s2)->s1.getName().compareToIgnoreCase(s2.getName());
	static Comparator<Student> gpaComparator = Comparator.comparingDouble(Student::getGpa);
	static Comparator<Student> gradeComparator = Comparator.comparing(Student::getGradeLevel);
	
	public static void sortByName(List<Student> students) {
		System.out.println("Sorted By Name: ");
		students.sort(nameComparator);
		students.forEach(studentPrinterConsumer);
	}
	
	public static void sortByGpa(List<Student> students) {
		System.out.println("Sorted By GPA: ");
		students.sort(gpaComparator);
		students.forEach(studentPrinterConsumer);
	}
	
	public static void sortByNameAndGrade(List<Student> students) {
		System.out.println("Sorted By Name and Grade: ");
		students.sort(gradeComparator.thenComparing(nameComparator));
		students.forEach(studentPrinterConsumer);
	}
	
	public static void sortByNameWithNull(List<Student> students) {
		System.out.println("Sorted By Name and Grade: ");
		students.sort(Comparator.nullsFirst(nameComparator));
		students.forEach(studentPrinterConsumer);
	}

	public static void main(String[] args) {
		List<Student> students = StudentDataBase.getAllStudents();
		System.out.println("Before Sorting: ");
		students.forEach(studentPrinterConsumer);
//		sortByNameAndGrade(students);
		students.set(0, null);
		sortByNameWithNull(students);
		sortByName(students);
	}
}
