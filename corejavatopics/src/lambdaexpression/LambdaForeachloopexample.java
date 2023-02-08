package lambdaexpression;

import java.util.ArrayList;
import java.util.List;

public class LambdaForeachloopexample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("vishnu");
		list.add("shankar");
		list.add("madisetty");
		System.out.println(list);
		/*
		 * for(String s:list) { System.out.println(s); }
		 */
		list.forEach(s -> System.out.println(s));
	}

}
