package practice;

import java.util.Scanner;

public class Asec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, z;
		System.out.println("enter the value of x");
		x = sc.nextInt();
		System.out.println("enter the value of y");
		y = sc.nextInt();
		System.out.println("enter the value of z");
		z = sc.nextInt();
		if (x > y && z > y && z > x) {
			System.out.println(y);
			System.out.println(x);
			System.out.println(z);

		}
		if (y > x && z > x && z > y) {
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
		}
		if (y > z && x > z && x > y) {
			System.out.println(z);
			System.out.println(y);
			System.out.println(x);
		}

	}
}
