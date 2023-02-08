package collection;

import java.util.ArrayList;

class Student {
	private int rollno;
	private String name;

	public Student(int i, String string) {
		this.name = name;
		this.rollno = rollno;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class ArrayListObjects {
	public static void main(String[] args) {
		ArrayList<Student> obj = new ArrayList<>();
		obj.add(new Student(1, "vishnu"));
		obj.add(new Student(2, "shankar"));
		System.out.println(obj);
		for (Student vis : obj) {
			System.out.println(vis.getRollno() + "\t" + vis.getName());
		}

	}

}
