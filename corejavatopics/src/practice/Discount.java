package practice;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float mill, handloom;
		System.out.println("enter the amount for mill");
		mill = sc.nextFloat();
		System.out.println("enter the amount for handloom");
		handloom = sc.nextFloat();
		float total = mill + handloom;
		if (total > 0 && total < 100) {
			float mill1 = 0;
			float handloom1 = 0.05f;
			float final_total = (mill - mill * mill1) + (handloom - handloom * handloom1);
			System.out.println("final amount =" + final_total);

		} else if (total > 100 & total < 200) {
			float mill1 = 0.05f;
			float handloom1 = 0.075f;
			float final_total = (mill - mill * mill1) + (handloom - handloom * handloom1);
			System.out.println("final amount =" + final_total);

		} else if (total > 200 & total < 300) {
			float mill1 = 0.075f;
			float handloom1 = 0.10f;
			float final_total = (mill - mill * mill1) + (handloom - handloom * handloom1);
			System.out.println("final amount =" + final_total);

		} else if (total > 300 & total < 400) {
			float mill1 = 0.10f;
			float handloom2 = 0.15f;
			float final_total = (mill - mill * mill1) + (handloom - handloom * handloom2);
			System.out.println("final amount =" + final_total);
		}
	}
}
