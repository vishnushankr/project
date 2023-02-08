package controlstatements;

import java.util.Scanner;

public class Greatestofthree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of x");
		int x = sc.nextInt();
		System.out.println("enter the value of y");
		int y = sc.nextInt();
		System.out.println("enter the value of z");
		int z = sc.nextInt();
		if (x > y && x > z)
			System.out.println("the greatest value is : " + x);
		else if (y > z) {
			System.out.println("the greatest value is : " + y);
		} else {
			System.out.println("the greatest value is :" + z);
		}

	}

}
