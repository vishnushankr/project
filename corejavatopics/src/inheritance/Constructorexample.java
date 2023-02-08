package inheritance;

class Parent {

	Parent() {
		System.out.println("vishnu");
	}

	Parent(int a) {
		System.out.println("vishnu rank is " + a);
	}
}

class Child extends Parent {
	Child() {
		super(1);
		System.out.println("");
	}
}

public class Constructorexample {

	public static void main(String[] args) {
		Child obj1 = new Child();
	}

}
