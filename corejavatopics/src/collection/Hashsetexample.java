package collection;

import java.util.HashSet;

public class Hashsetexample {

	public static void main(String[] args) {
		HashSet<Integer> obj = new HashSet<>();
		obj.add(12);
		obj.add(26);
		obj.add(null);
		obj.add(26);
		obj.add(18);
		System.out.println(obj);
	}

}
