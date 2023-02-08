package collection;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Treesetexample {

	public static void main(String[] args) {
		TreeSet<Integer> obj = new TreeSet<>();
		obj.add(10);
		obj.add(20);
		obj.add(15);
		obj.add(8);
		System.out.println(obj);
		obj.add(22);
		NavigableSet<Integer> obj1 = obj.descendingSet();
		System.out.println(obj1);
		
		TreeSet<String> obj2=new TreeSet<>();
		obj2.add("VISHNU");
		obj2.add("SHANKAR");
		obj2.add("vishnu");
		System.out.println(obj2);
	}

}
