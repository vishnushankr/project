package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		HashSet<String> obj = new HashSet<>();
		System.out.println("random string names");
		obj.add("vishnu");
		obj.add("shankar");
		obj.add("manikanta");
		obj.add("manjunath");
		System.out.println(obj);

		ArrayList<String> obj1 = new ArrayList<>();
		System.out.println("string before deleting");
		obj1.add("pruthvi");
		obj1.add("shiva");
		obj1.add("vishnu");
		System.out.println(obj1);
		for (int i = 0; i < obj1.size(); i++) {
			if (obj1.get(i).equalsIgnoreCase("vishnu")) {
				obj1.remove(i);
			}
		}
		System.out.println("string after deleting same parameter");
		System.out.println(obj1);

		ArrayList<String> obj2 = new ArrayList<>();
		obj2.add("vishnu");
		obj2.add("Shankar");
		obj2.add("madisetty");
		obj2.add("shiva");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String vis = sc.next();
		for (int j = 0; j < obj2.size(); j++) {
			if (obj2.get(j).equalsIgnoreCase(vis)){
				obj2.remove(j);
			}
		}
		System.out.println("string after deleting same parameter");
		System.out.println(obj2);

	}
}
