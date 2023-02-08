package Stactic;

public class Staticexample2 {
	int rollno;
	String name;
	static String collage = "ashoka";

	Staticexample2(int r, String n) {
		rollno = r;
		name = n;

	}

	void display() {
		System.out.println("rollno:" + rollno);
		System.out.println("name:" + name);
		System.out.println("collage:" + collage);

	}

	public static void main(String[] args) {
		Staticexample2 obj1 = new Staticexample2(100, "vishnu");
		Staticexample2 obj2 = new Staticexample2(200, "shankar");
		obj1.display();
		obj2.display();
	}
}
