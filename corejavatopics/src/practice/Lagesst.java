package practice;

import java.util.Scanner;

public class Lagesst {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x, y;
		System.out.println("enter the value of x");
		x = sc.nextInt();
		System.out.println("enter the value of y");
		y = sc.nextInt();
		if (x > 10 & y < 20) {
			System.out.println("hi");
		} else if (x > 20 & y < 30) {
			System.out.println("hello");

		}
	}
}
