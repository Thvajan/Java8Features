package learning.defaultexamples;

public interface Interface2 extends Interface1{
	
	default void method2() {
		System.out.println("Inside method2");
	}
	
	default void method1() {
		System.out.println("Inside method1 in "+ Interface2.class);
	}
}
