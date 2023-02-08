package oops;

import java.util.Scanner;

interface lbnagar {
	void start();
}

interface gachibowli {
	void reach();
}

class travelbybike implements lbnagar, gachibowli {

	@Override
	public void reach() {
		System.out.println("I reached the office by 9:20am");
	}

	@Override
	public void start() {
		System.out.println("I started to office at 8:15am");
	}

}

class travelbymetro implements lbnagar, gachibowli {

	@Override
	public void reach() {
		System.out.println("I reached the office by 9:45am");
	}

	@Override
	public void start() {
		System.out.println("I started to office at 8:15am");
	}

}

public class Interfaceexample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1 for bike and 2 for metro");
		int a = sc.nextInt();
		if (a == 1) {
			travelbybike t = new travelbybike();
			t.start();
			t.reach();

		}
		else if (a == 2) {
			travelbymetro t1 = new travelbymetro();
			t1.start();
			t1.reach();
		}else {
			System.out.println("by walk 5hours");
		}
	}
}



