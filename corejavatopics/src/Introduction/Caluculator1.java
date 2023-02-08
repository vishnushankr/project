package Introduction;

import java.util.Scanner;

public class Caluculator1 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the choice");
System.out.println("1:add 2:sub 3:mul 4:div");
int choice=sc.nextInt();
System.out.println("enter the value of a");
int a=sc.nextInt();
System.out.println("enter the value of b");
int b=sc.nextInt();
switch(choice) {
case 1:
	System.out.println(a+b);
	break;
case 2:
	System.out.println(a-b);
	break;
case 3:
	System.out.println(a*b);
	break;
case 4:
	System.out.println(a/b);
	break;
}
	}

}
