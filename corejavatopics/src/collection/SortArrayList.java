package collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
		ArrayList<String> obj = new ArrayList<>();
		obj.add("vishnu");
		obj.add("shankar");
		obj.add("madisetty");
		System.out.println(obj);
		Collections.sort(obj, Collections.reverseOrder());
		for (String s : obj) {
			System.out.println(s);
		}
	}

}
