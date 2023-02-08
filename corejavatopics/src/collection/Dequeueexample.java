package collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeueexample {

	public static void main(String[] args) {
		Deque<String> obj = new ArrayDeque<>();
		obj.add("vishnu");
		obj.add("shankar");
		obj.add("madisetty");
		obj.add("shiva");
		obj.add("manjunath");
		System.out.println(obj);

		System.out.println(obj.poll());
		//System.out.println(obj.poll());
		//System.out.println(obj.poll());
		//System.out.println(obj.poll());
		//System.out.println(obj.poll());
		//System.out.println(obj.poll());

	}

}
