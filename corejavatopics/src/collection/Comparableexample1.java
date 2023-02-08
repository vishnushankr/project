package collection;

import java.util.ArrayList;


import java.util.Collections;

class Employee1 implements Comparable<Employee1> {
	private int age;

	public Employee1(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Employee1 emp) {
		return this.age - emp.getAge();
	}

}

public class Comparableexample1 {

	public static void main(String[] args) {
		ArrayList<Employee1> obj = new ArrayList<>();
		obj.add(new Employee1(20));
		obj.add(new Employee1(30));
		obj.add(new Employee1(15));
		Collections.sort(obj);
		for (Employee1 vis : obj) {
			System.out.println(vis.getAge());
		}

	}

}
