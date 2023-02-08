package collection;

import java.util.PriorityQueue;

public class PriorityQueueexample {

	public static void main(String[] args) {
		PriorityQueue<String> obj = new PriorityQueue<>();
		obj.add("vishnu");
		obj.add("shankar");
		obj.add("madisetty");
		obj.add("shiva");
		System.out.println(obj);
		System.out.println(obj.peek());

	}

}
