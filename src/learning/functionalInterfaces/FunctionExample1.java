package learning.functionalInterfaces;

public class FunctionExample1 {

	public static String performConcat(String str) {
		return FunctionExample.concat.apply(str);
	}

	public static void main(String[] args) {
		String a = performConcat("Upper again");
		System.out.println(a);
	}

}
