package learning.functionalInterfaces;

import java.util.function.Function;

public class FunctionExample {

	static Function<String, String> function = (name) -> name.toUpperCase();

	static Function<String, String> concat = (name) -> name.concat(" -> processed");

	public static void main(String[] args) {
		System.out.println(function.apply("try upper"));
		
		System.out.println(function.andThen(concat).apply("try upper"));
		
		
		System.out.println(function.compose(concat).apply("try upper"));// same as System.out.println(concat.andThen(function).apply("try upper"));
	}

}
