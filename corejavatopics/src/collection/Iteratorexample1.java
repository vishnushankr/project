package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class Iteratorexample1 {

	public static void main(String[] args) {
		ArrayList<Integer> obj = new ArrayList<>();
		obj.add(3);
		obj.add(2);
		obj.add(12);
		obj.add(15);
		System.out.println(obj);
		obj.remove(2);
		System.out.println(obj);

		System.out.println("output through itertor");
		ListIterator it = obj.listIterator();
		while (it.hasNext())
			System.out.println(it.next());
		while (it.hasPrevious())
			System.out.println(it.previous());
	}

}
