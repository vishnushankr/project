package controlstatements;

import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of x");
		int x = sc.nextInt();
		System.out.println("enter the value of y");
		int y = sc.nextInt();
		if (x > y) {
			System.out.println("vishnu");
		} else {
			System.out.println("shankar");
		}
	}

}
