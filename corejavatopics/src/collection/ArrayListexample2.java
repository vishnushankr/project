package collection;

import java.util.ArrayList;

public class ArrayListexample2 {

	public static void main(String[] args) {
		ArrayList<String> obj = new ArrayList<>();
		obj.add("vishnu");
		obj.add("shankar");
		obj.add(1, "madisetty");
		System.out.println(obj);
		obj.remove(2);
		System.out.println(obj);
	}
}
