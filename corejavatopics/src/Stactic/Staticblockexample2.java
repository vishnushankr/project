package Stactic;

class ClassB {
	ClassB() {
		System.out.println("vishnu");
	}

	{
		System.out.println("shankar");
	}
	static {
		System.out.println("madisetty");
	}
}

public class Staticblockexample2 {

	public static void main(String[] args) {
		ClassB obj1 = new ClassB();
		ClassB obj2 = new ClassB();
	}

}
