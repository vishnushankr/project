package collection;

import java.util.PriorityQueue;

public class PriorityQueueexample2 {

	public static void main(String[] args) {
		PriorityQueue<Integer> obj = new PriorityQueue<>();
		obj.add(10);
		obj.add(20);
		obj.add(12);
		obj.add(8);
		obj.add(22);
		System.out.println(obj);
//obj.peek();
		System.out.println(obj.peek());

	}

}
