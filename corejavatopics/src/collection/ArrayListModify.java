package collection;

import java.util.ArrayList;

public class ArrayListModify {

	public static void main(String[] args) {
		ArrayList<String> obj = new ArrayList<>();
		obj.add("vishnu");
		obj.add("shankar");
		obj.add("madisetty");
		for (int i = 0; i < obj.size(); i++) {
			obj.set(i, obj.get(i).toUpperCase());
		
			System.out.println(obj.get(i));
		}

	}
}
