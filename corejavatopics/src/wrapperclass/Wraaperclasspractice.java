package wrapperclass;

import java.util.Scanner;

public class Wraaperclasspractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the vale of s");
		String s = sc.next();
		System.out.println("enter the vlaue of h ");
		String h = sc.next();
		System.out.println("enter the value of w");
		String w = sc.next();
		int a = Integer.parseInt(s);
		int b = Integer.parseInt(h);
		int c = Integer.parseInt(w);

		System.out.println("sum of three number is " + (a + b + c));
	}

}
