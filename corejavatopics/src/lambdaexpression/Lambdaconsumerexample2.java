package lambdaexpression;

import java.util.ArrayList;

import java.util.List;
import java.util.function.Consumer;

public class Lambdaconsumerexample2 {

	public static void main(String[] args) {
		Consumer<List<Integer>> modify = list -> {
			for (int i = 0; i < list.size(); i++) {
				list.set(i, 2 * list.get(i));
			}
		};
		Consumer<List<Integer>> displaylist = list -> list.forEach(s -> System.out.println(s));
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);

		modify.andThen(displaylist).accept(list);
	}

}
