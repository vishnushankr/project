package controlstatements;

import java.util.Scanner;

public class Sumnatural {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of x");
		int x = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			x = x + i;
		}
		System.out.println("the sum of natural numbers are :" + x);
	}
}
