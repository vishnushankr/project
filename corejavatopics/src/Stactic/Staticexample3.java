package Stactic;

public class Staticexample3 {
	int count = 0;
	static int num = 0;

	Staticexample3() {
		count++;
		num++;
		System.out.println("count is" + count);
		System.out.println("num is" + num);

	}

	public static void main(String[] args) {
		Staticexample3 c1 = new Staticexample3();
		Staticexample3 c2 = new Staticexample3();
		Staticexample3 c3 = new Staticexample3();

	}
}
