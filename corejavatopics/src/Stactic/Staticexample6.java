package Stactic;

import java.util.Scanner;

public class Staticexample6 {
	int a;
	static int b;

	public void get() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of a");
		a = sc.nextInt();
		System.out.println("enter the value of b");
		b = sc.nextInt();

	}

	public static void display() {
		System.out.println("b is " + b);
	}

	public static void main(String[] args) {
		Staticexample6 obj1 = new Staticexample6();
		Staticexample6.display();
		obj1.get();

	}
}