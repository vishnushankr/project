package methods;

import java.util.Scanner;

public class Methodexample4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float x, y;
		System.out.println("Enter the value of x:");
		x = sc.nextFloat();
		System.out.println("Enter the values of y:");
		y = sc.nextFloat();
		float all = Methodexample4.vis(x, y);
		System.out.println("The division of two numbers is:" + all);

	}

	public static float vis(float x, float y) {
		float cal;
		cal = x / y;
		return cal;

	}
}
