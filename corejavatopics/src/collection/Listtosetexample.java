package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Listtosetexample {

	public static void main(String[] args) {
		List<Integer> obj = new ArrayList<>();
		obj.add(10);
		obj.add(12);
		obj.add(5);
		obj.add(9);
		obj.add(3);
		System.out.println(obj);
		TreeSet<Integer> vis = new TreeSet<>(obj);
		System.out.println(vis);
	}

}
