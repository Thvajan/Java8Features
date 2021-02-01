package learning.functionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

	static UnaryOperator<StringBuilder> concat = (s) -> s.append("Concatinated");

	public static void main(String[] args) {
		System.out.println(concat.apply(new StringBuilder("StringBuilders :) ")));
	}
}
