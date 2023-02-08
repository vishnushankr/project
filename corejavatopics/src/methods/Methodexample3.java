package methods;

import java.util.Scanner;

public class Methodexample3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		System.out.println("Enter the value of x");
		x = sc.nextInt();
		System.out.println("Enter the value of y");
		y = sc.nextInt();
		int product = Methodexample3.total(x, y);
		System.out.println("The product of values are:" + product);
		int sum = Methodexample2.sum(x, y);
		System.out.println("The sum of two values are:" + sum);
		int greatest = Methodexample1.Max(x, y);
		System.out.println("The largest value is:" + greatest);
	}

	public static int total(int x, int y) {
		int mul;
		mul = x * y;
		return mul;
	}
}
