package collection;

import java.util.ArrayList;

public class ArrayListexample3 {

	public static void main(String[] args) {
		ArrayList<Integer> obj = new ArrayList<>();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		System.out.println(obj);
		obj.remove(2);
		System.out.println(obj);
	}
}
