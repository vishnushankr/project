package methods;

import java.util.Scanner;

public class Methodexample2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		System.out.println("enter the value of x");
		x = sc.nextInt();
		System.out.println("enter the value of y");
		y = sc.nextInt();
		int tot = Methodexample2.sum(x, y);
		System.out.println("the sum of the two numbers is:" + tot);

	}

	public static int sum(int x, int y) {
		int total;
		total = x + y;
		return total;
	}
}
