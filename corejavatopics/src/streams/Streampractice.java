package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Streampractice {

	public static void main(String[] args) {
		
		List<Integer> number=Arrays.asList(2,3,4,5);
		List<Integer> square=number.stream().map(s->s*s).collect(Collectors.toList());
		System.out.println(square);
		
		List<String> names=Arrays.asList("vishnu","shankar","madisetty");
		List<String> result=names.stream().filter(s->s.startsWith("v")).collect(Collectors.toList());
		System.out.println(result);
		
		List<String> show=names.stream().sorted().collect(Collectors.toList());
		System.out.println(show);
		
		List<Integer> numbers=Arrays.asList(2,4,3,5,6);
		Set<Integer> squareset=numbers.stream().map(s->s*s).collect(Collectors.toSet());
		
		
		number.stream().map(s->s*s).forEach(p->System.out.println(p));
		
		int even=number.stream().filter(s->s%2==0).reduce(0,(ans,i)->ans+i );
		System.out.println(even);

}
}
