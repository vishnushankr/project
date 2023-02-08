package controlstatements;

import java.util.Scanner;

public class Payment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the working hours");
		int workinghours = sc.nextInt();
		if (workinghours >= 8) {
			System.out.println("full paymnet");
		} else {
			System.out.println("deduction in payment");
		}
	}
}
