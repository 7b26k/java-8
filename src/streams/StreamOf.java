package streams;

import java.util.stream.Stream;

public class StreamOf {
	public static void main(String[] args) {
		
		
		//for group of values
		Stream<Double> d=Stream.of(9.9,99.9,999.9,999.9);
		d.forEach(System.out::println);
	
		//for arrays
		Double[] e= {1.1,11.1,111.1,1111.1};
		Stream<Double> s=Stream.of(e);
		s.forEach(System.out::println);
	}
}
