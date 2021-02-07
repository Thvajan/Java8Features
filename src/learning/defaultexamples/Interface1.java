package learning.defaultexamples;

public interface Interface1 {

	default void method1() {
		System.out.println("Inside method1 " + Interface1.class);
	}
}
