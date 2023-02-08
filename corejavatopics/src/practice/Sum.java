package practice;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		/*
		 * int i,sum = 0; for(i=0;i<=10;i++) { sum=i+sum; }
		 * System.out.println("the sum of 10 natural numbers are:"+sum); }
		 * 
		 * }
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int j = sc.nextInt();
		int num;
		int sum = 0;
		for (num = 1; num <= j; num++)
			sum = sum + num;
		System.out.println(sum);
	}
}