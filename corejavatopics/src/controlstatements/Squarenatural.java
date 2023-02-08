package controlstatements;

import java.util.Scanner;

public class Squarenatural {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");
		int value = sc.nextInt();
		int x = 0;
		int sum = 0;
		for (int i = 1; i <= value; i++) {
			x = i * i;
			sum = sum + x;
		}
		System.out.println(sum);
	}
}
