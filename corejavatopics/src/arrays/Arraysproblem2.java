package arrays;

import java.util.Scanner;

public class Arraysproblem2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any value:");
		int x = sc.nextInt();
		int a[] = { 10, 20, 30, 40, 50, };
		int linearsearch = Arraysproblem2.search(a, x);

		if (linearsearch == 1)
			System.out.println("not present");
		else
			System.out.println("Element is present " + linearsearch);

	}

	public static int search(int a[], int x) {
		x = a.length;
		for (int i = 0; i <= a.length; i++) {
			if (x == a[i])
				return i;
		}
		return 1;
	}
}
