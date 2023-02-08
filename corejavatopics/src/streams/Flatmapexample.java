package streams;

import java.util.*;

import java.util.stream.Collectors;

public class Flatmapexample {

	public static void main(String[] args) {
		List<List<Integer>> obj = new ArrayList<>();
		obj.add(Arrays.asList(1, 2));
		obj.add(Arrays.asList(3, 4));
		obj.add(Arrays.asList(5, 6));
		obj.add(Arrays.asList(7, 8));

		System.out.println("list" + obj);

		List<Integer> flatList = obj.stream().flatMap(list -> list.stream()).collect(Collectors.toList());

		System.out.println(flatList);
	}

}
