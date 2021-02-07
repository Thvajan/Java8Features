package learning.streams.numericstreams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreams {

	public static void main(String[] args) {
		IntStream range = IntStream.range(1, 10);
		System.out.println(range.count());
		IntStream.range(1, 10).forEach(value->System.out.print(value+" "));
		System.out.println();
		IntStream.rangeClosed(1, 10).forEach(value->System.out.print(value+" "));
		System.out.println();
		LongStream.range(1, 10).forEach(value->System.out.print(value+" "));
		System.out.println();
		LongStream.rangeClosed(1, 10).forEach(value->System.out.print(value+" "));
		System.out.println();
		IntStream.range(1,10).asDoubleStream().forEach(value->System.out.print(value+" "));
		System.out.println();
		IntStream.rangeClosed(1,10).asDoubleStream().forEach(value->System.out.print(value+" "));
	}
}
