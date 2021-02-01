package learning.test;

import java.util.stream.IntStream;

public class ImperativeVsDeclarativeEx2 {

	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 0; i <= 100; i++) {
			sum += i;
		}
		
		System.out.println("Imperative Sum:" + sum);

//		int streamSum = IntStream.rangeClosed(0, 100).sum();
		int streamSum = IntStream.rangeClosed(0, 100).parallel().sum();

		System.out.println("Declarative Sum:" + streamSum);
	}
}
