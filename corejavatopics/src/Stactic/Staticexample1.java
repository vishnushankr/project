package Stactic;

class static_out {
	static int x;
	int y;

	public void add(int a, int b) {
		x = a + b;
		y = x + b;
	}

	static void display() {
		System.out.println("x=" + x);
	}

}

public class Staticexample1 {

	public static void main(String[] args) {
		static_out obj = new static_out();
		obj.add(10, 15);
		static_out.display();

	}

}
