package methods;

import java.util.Scanner;

public class Methodexample1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of x");
		int x = sc.nextInt();
		System.out.println("enter the value of y");
		int y = sc.nextInt();
		int greatest_value = Methodexample1.Max(x, y);
		System.out.println("the largest value is:" + greatest_value);

	}

	public static int Max(int x, int y) {
		int large;
		if (x > y) {
			large = x;
		} else {
			large = y;
		}
		return large;

	}
}
