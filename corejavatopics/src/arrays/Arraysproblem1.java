package arrays;

import java.util.Scanner;

public class Arraysproblem1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number");

		int x = sc.nextInt();
		int a[] = { 2, 15, 20, 25, 30, 35, 32, 17 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				System.out.println(i);
			}

			else {
				System.out.println("the number is not present:");
			}

		}

	}
}