package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class employee2 {
	private String name;
	private int age;

	public employee2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

class age implements Comparator<employee2> {

	@Override
	public int compare(employee2 o1, employee2 o2) {
		// TODO Auto-generated method stub
		return o1.getAge() - o2.getAge();
	}

}

class name implements Comparator<employee2> {

	@Override
	public int compare(employee2 o1, employee2 o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}

public class Comparatorexample {

	public static void main(String[] args) {
		ArrayList<employee2> obj = new ArrayList<>();
		obj.add(new employee2("vishnu", 22));
		obj.add(new employee2("shankar", 23));
		obj.add(new employee2("manikanta", 24));
		obj.add(new employee2("shiva", 25));
		obj.add(new employee2("manjunath", 21));

		age obj1 = new age();
		Collections.sort(obj, obj1);
		System.out.println("list According to age");
		for (employee2 obj2 : obj) {
			System.out.println(obj2.getAge() + "\t" + obj2.getName());
		}
		name obj3 = new name();
		Collections.sort(obj, obj3);
		System.out.println("list according to names");
		for (employee2 obj4 : obj)
			System.out.println(obj4.getName() + "\t" + obj4.getAge());

	}

}
