package streams;

import java.util.ArrayList;
import java.util.List;

public class Streamintermediateexample {

	public static void main(String[] args) {
List<String> numbers=new ArrayList<>();
numbers.add("vishnu");
numbers.add("shiva");
numbers.add("mani");
numbers.add("manjunath");
numbers.add("pruthvi");

numbers.stream().filter((s)->s.startsWith("v")).forEach(System.out::println);
System.out.println("---------");
numbers.stream().filter((s)->s.startsWith("v")).map(String::toUpperCase).forEach(System.out::println);
System.out.println("---------");
numbers.stream().sorted().map(String::toUpperCase).forEach(p->System.out.println(p));
	}

}
