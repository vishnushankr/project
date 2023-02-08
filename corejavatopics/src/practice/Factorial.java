package practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any value");
		int x;
		x = sc.nextInt();
		int fact = 1;
		for (int i = 1; i <= x; i++) {
			fact = fact * x;
			System.out.println(fact);

		}
	}
}
