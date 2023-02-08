package practice;

import java.util.Scanner;

public class Nested {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the grade=");
		char grade = sc.next().charAt(0);
		
			/*
			 * switch (grade) { case "A": System.out.println("good job"); break; case "B":
			 * System.out.println("pretty job"); break; case "C":
			 * System.out.println("passed"); break; case "D":
			 * System.out.println("not so good"); break; case "E":
			 * System.out.println("failed"); break; default: System.out.println("others");
			 * break;
			 */
		
		if(grade=='A')
		{
			System.out.println("good job");
			
		}
		if(grade=='B')
		{
			System.out.println("pretty job");
			
		}
		if(grade=='C')
		{
			System.out.println("passed");
			
		}
		if(grade=='D')
		{
			System.out.println("not so good");
			
		}
		if(grade=='E')
		{
			System.out.println("failed");
			
		}
		if(grade=='F')
		{
			System.out.println("others");
			
		}
		}

	}

	

	



