package controlstatements;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the grade :");
		String grade = sc.next();
		switch (grade) {
		case "O":
			System.out.println("outstanding");
			break;
		case "A+":
			System.out.println("Excellent");
			break;
		case "A":
			System.out.println("very good");
			break;
		case "B+":
			System.out.println("good");
			break;
		case "B":
			System.out.println("Average");
			break;
		case "c":
			System.out.println("Pass");
			break;
		case "F":
			System.out.println("Fail");
			break;
		default:
			System.out.println("Absent");
			break;
		}
	}

}
