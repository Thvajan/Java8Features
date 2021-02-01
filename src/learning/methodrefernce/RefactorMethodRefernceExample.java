package learning.methodrefernce;

import java.util.function.Predicate;

import learning.data.Student;
import learning.functionalInterfaces.SupplierExample;

public class RefactorMethodRefernceExample {

	static Predicate<Student> predicateGradeStudent = RefactorMethodRefernceExample::gradeGreaterThan3;

	public static boolean gradeGreaterThan3(Student student) {
		return student.getGradeLevel() >= 3;
	}

	public static void main(String[] args) {
		System.out.println(gradeGreaterThan3(SupplierExample.studentSupplier.get()));
	}
}
