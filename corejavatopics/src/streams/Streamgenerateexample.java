package streams;

import java.util.Random;
import java.util.stream.Stream;

public class Streamgenerateexample {

	public static void main(String[] args) {
		Stream<Integer> numbers = Stream.generate(() -> (new Random()).nextInt(100));
		numbers.limit(25)
		//.forEach(System.out::println);
		.forEach(p->System.out.println(p));
	}

}
