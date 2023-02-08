package collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorListexample {

	public static void main(String[] args) {
		Vector<Integer> obj = new Vector<>();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		System.out.println(obj);
		obj.remove(1);
		System.out.println(obj);
		Iterator<Integer> itr = obj.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		for (Integer list : obj) {
			System.out.println(list);
		}
	}

}
