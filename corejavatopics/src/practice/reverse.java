package practice;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value for x");
		int x = sc.nextInt();
		int div = 0, rem;
		for (int i = 0; i <= x; i++) {
			rem = x % 10;
			div = div * 10 + rem;
			x = x / 10;
		}
		System.out.println(div);
	}

}
