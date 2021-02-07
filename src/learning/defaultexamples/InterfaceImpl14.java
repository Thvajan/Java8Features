package learning.defaultexamples;

public class InterfaceImpl14 implements Interface1, Interface4 {

	public static void main(String[] args) {
		InterfaceImpl14 impl = new InterfaceImpl14();
		impl.method1();// uses child overridden method
	}

	@Override
	public void method1() {
		Interface1.super.method1();
		Interface4.super.method1();
	}
}
