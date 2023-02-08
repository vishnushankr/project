package caluculator;

import java.util.Scanner;

public class Inputaddition {

	public static void main(String[] args) {

		int num1, num2;

		Scanner scan = new Scanner(System.in);

		System.out.println("enter the value of num1: ");

		num1 = scan.nextInt();

		System.out.println("enter the value of num2:");

		num2 = scan.nextInt();

		int sum = num1 + num2;
		System.out.println("the sum of values:" + sum);

	}

}
