package controlstatements;

public class Increment {

	public static void main(String[] args) {
		int x = 5;
		int a = ++x;
		System.out.println(a + " " + x);
		int b = x++;
		System.out.println(b + " " + x);
		int c = --x;
		System.out.println(c + " " + x);
		int d = x--;
		System.out.println(d + " " + x);
	}

}
