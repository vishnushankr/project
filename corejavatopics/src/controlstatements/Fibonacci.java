package controlstatements;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		/*
		 * Scanner sc=new Scanner(System.in); int f=sc.nextInt(); int l=sc.nextInt();
		 * int p=0,s=1,n=1; p=f; for(int i=f;i<1;i++) { s=p+n;
		 * 
		 * if(s<1) System.out.println(s+""); p=n; n=s;
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of first number");
		int f = sc.nextInt();
		System.out.println("enter second number");
		int l = sc.nextInt();
		int p = 0, n = 1, s, count = 10;
		p = f;
		for (int i = f; i < count; i++) {
			s = p + n;// 1+1=2 1+2=3
			System.out.print(" " + s);// 2 3
			p = n;// p=1 2
			n = s;// n=1 3

		}

	}

}
