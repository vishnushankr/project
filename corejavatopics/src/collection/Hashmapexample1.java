package collection;

import java.util.HashMap;

public class Hashmapexample1 {

	public static void main(String[] args) {
		HashMap<Integer, String> obj = new HashMap<>();
		obj.put(10, "vishnu");
		obj.put(11, "shankar");
		obj.put(12, "manikanta");
		obj.put(13, "shiva");
		obj.put(14, "vijay");
		System.out.println(obj);
		System.out.println("the size of the map is :"+obj.size());
		for (Integer key : obj.keySet()) {
			String name = obj.get(key);
			System.out.println(key + " " + name);
		}
		System.out.println();
		System.out.println(obj.isEmpty());
		System.out.println(obj.containsKey(obj));
		System.out.println(obj.containsValue("shankar"));

	}

}
