package learning.defaultexamples;

public class InterfaceImpl123 implements Interface1, Interface2, Interface3 {
	
	public void method1() {
		
		System.out.println("Inside method1 in " + InterfaceImpl123.class);
	}

	public static void main(String[] args) {
		InterfaceImpl123 impl = new InterfaceImpl123();
		impl.method1();// uses child overridden method
		impl.method2();
		impl.method3();
	}
}
