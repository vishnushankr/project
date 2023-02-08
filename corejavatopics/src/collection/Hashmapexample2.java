package collection;

import java.util.*;

public class Hashmapexample2 {

	public static void main(String[] args) {
		Map<String, Integer> vis = new HashMap<String, Integer>();
		System.out.println(args.length);
		for (String str : args) {
			Integer i = str.length();
			vis.put(str, i);
		}
		System.out.println(vis.size());
		System.out.println(vis);
		for (String v : vis.keySet()) {
			System.out.println(v + vis.get(v));
		}
	}

}
