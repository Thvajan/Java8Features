package learning.methodrefernce;

import java.util.function.Function;

public class MethodRefernceExample {

	static Function<String, char[]> fun = String::toCharArray;
	static Function<String, String> upperFun = String::toUpperCase;

	public static void main(String[] args) {
		char[] a = fun.apply("hello");
		for (char c : a) {
			System.out.println(c);
		}
		System.out.println(upperFun.apply("lower"));
	}
}
