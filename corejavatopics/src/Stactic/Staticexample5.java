package Stactic;

public class Staticexample5 {
	int rollno;
	static int id = 0;
	String name;

	public Staticexample5(String name) {
		rollno = ++id;
		this.name = name;

		System.out.println("rollno" + rollno);
		System.out.println("id" + id);
		System.out.println("name" + name);

	}

	public static void main(String[] args) {
		Staticexample5 obj1 = new Staticexample5("vishnu");
		Staticexample5 obj2 = new Staticexample5("shankar");
	}
}
