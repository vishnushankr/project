package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamtoArrayexample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		 
        for(int i = 1; i<= 10; i++){
            list.add(i);
        }

        Stream<Integer> stream = list.stream();
        Integer[] evenNumbersArr = stream.filter(i -> i%2 == 0).toArray(Integer[]::new);
        Stream<Integer>s=Stream.of(evenNumbersArr);
        s.forEach(p->System.out.println(p));
	}

}
