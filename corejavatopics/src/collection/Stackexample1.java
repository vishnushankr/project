package collection;

import java.util.Stack;

public class Stackexample1 {

	public static void main(String[] args) {
		Stack<Integer> obj = new Stack<>();
		obj.add(20);
		obj.add(30);
		obj.add(25);
		obj.add(40);
		System.out.println(obj);
		System.out.println(obj.peek());
		System.out.println(obj.pop());
		obj.push(12);
		obj.push(15);
		obj.push(14);
		obj.add(26);
		System.out.println(obj);
		System.out.println((Integer) obj.peek());
		System.out.println((Integer) obj.pop());
	}

}
