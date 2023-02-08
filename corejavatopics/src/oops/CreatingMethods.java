package oops;

public class CreatingMethods {
	void show() {
		System.out.println("this is method");// declaring a method1
	}

	void display() {
		System.out.println("this is another method");// declaring method2
	}

	public static void main(String[] args) {
		CreatingMethods obj = new CreatingMethods();// creating object
		obj.display(); // calling method1
		obj.show(); // calling method2

	}

}
