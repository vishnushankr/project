package inheritance;

class ClassA {
	void show() {
		System.out.println("vishnu");
	}

	ClassA() {
		System.out.println("shankar");
	}
}

class ClassB extends ClassA {
	ClassB() {
		super();
		System.out.println("madisetty");
	}

	void show() {
		System.out.println("vishnu");
		super.show();
	}
}

public class Superexample {

	public static void main(String[] args) {
		ClassB obj1 = new ClassB();
	}

}
