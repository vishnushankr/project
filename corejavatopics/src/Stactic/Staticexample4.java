package Stactic;

public class Staticexample4 {
	static int count = 0;

	Staticexample4() {
		count++;
		System.out.println("count is" + count);

	}

	public static void main(String[] args) {
		Staticexample4 c1 = new Staticexample4();
		Staticexample4 c2 = new Staticexample4();
		Staticexample4 c3 = new Staticexample4();

	}
}
