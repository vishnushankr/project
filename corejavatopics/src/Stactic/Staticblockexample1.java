package Stactic;

public class Staticblockexample1 {
	static {
		System.out.println("vishnu");
	}
	{
		System.out.println("shankar");
	}

	public Staticblockexample1() {
		System.out.println("madisetty");
	}

	public static void main(String[] args) {
		Staticblockexample1 obj1 = new Staticblockexample1();
		Staticblockexample1 obj2 = new Staticblockexample1();

	}
}
