package learning.defaultexamples;

public interface Interface3 extends Interface2{

	default void method3() {
		System.out.println("Inside method3");
	}
}
