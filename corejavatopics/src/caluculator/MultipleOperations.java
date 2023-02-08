package caluculator;

import java.util.Scanner;

public class MultipleOperations {

	public static void main(String[] args) {
		
		int num1,num2;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter 1 add 2 sub 3 mul 4 div");
		
		int choice= scan.nextInt();
		 System.out.println("enter the value of num1:");
		 num1=scan.nextInt();
		 System.out.println("enter the value of num2:");
		 num2=scan.nextInt();
		 switch(choice) {
		 case 1:
			int add=num1+num2;
			 System.out.println("the sum="+add);
			break;
		 case 2:
			 int sub=num1-num2;
			 System.out.println("the differnec="+sub);
			 break;
		 case 3:
			 int mul=num1*num2;
			 System.out.println("the multiplication="+mul);
			 break;
		 case 4:
			 int div=num1/num2;
			 System.out.println("the division="+div);
			 break;
			
		 }
		

	}

}
