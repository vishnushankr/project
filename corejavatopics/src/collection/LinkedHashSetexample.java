package collection;

import java.util.LinkedHashSet;

public class LinkedHashSetexample {

	public static void main(String[] args) {
		LinkedHashSet<Integer> obj = new LinkedHashSet<>();
		obj.add(12);
		obj.add(24);
		obj.add(26);
		obj.add(77);
		obj.add(null);
		obj.add(26);
		System.out.println(obj);

	}

}
