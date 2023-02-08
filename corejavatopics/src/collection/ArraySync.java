package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArraySync {

	public static void main(String[] args) {
		ArrayList<String> alist = new ArrayList<>();
		Collections.synchronizedList(alist);

		alist.add("Hello");
	}

}
