package caluculator;

import java.util.Scanner;

public class Add5 {

	public static void main(String[] args) {
		int i;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int num = scan.nextInt();
		for (i = 1; i <= 10; i++) {

			System.out.println(num + "*" + i + "=" + i * num);
		}
	}
}