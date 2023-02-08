package collection;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Setexample1 {

	public static void main(String[] args) {
		TreeSet<Integer> obj = new TreeSet<>();
		obj.add(40);
		obj.add(20);
		obj.add(30);
		obj.add(10);
		// obj.add(null); //null value cannot performed here
		System.out.println(obj);
		NavigableSet<Integer> obj1 = obj.descendingSet();
		obj.add(50);
		System.out.println(obj1);
	}

}
