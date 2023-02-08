package streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streamsofcharexample {

	public static void main(String[] args) {
Stream<String> obj=Stream.of("HELLO EVERYONE".split(" "));
obj.forEach(p->System.out.println(p));

IntStream stream = "12345_abcdefg".chars();
stream.forEach(p -> System.out.println(p+" "+(char)p));
 
	
	}
}
