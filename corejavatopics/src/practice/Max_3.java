package practice;

import java.util.Scanner;

public class Max_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, z;
		System.out.println("enter the value of x");
		x = sc.nextInt();
		System.out.println("enter the value of y");
		y = sc.nextInt();
		System.out.println("enter the value of z");
		z = sc.nextInt();
		if (x > y & x > z) {

			System.out.println(x);
		} else if (y > z) {

			System.out.println(y);
		} else {
			System.out.println(z);
		}
	}

}
