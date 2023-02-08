package collection;

import java.util.ArrayList;

public class Forenhancedloop {

	public static void main(String[] args) {
		ArrayList<Integer> obj = new ArrayList<>();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		System.out.println(obj);
		System.out.println("--------------");
		System.out.println("for enhanced loop");
		for (Integer list : obj) {
			System.out.println(obj);
			for (int i = 0; i < obj.size(); i++) {
				System.out.println(obj.get(i));
			}
		}
	}

}
