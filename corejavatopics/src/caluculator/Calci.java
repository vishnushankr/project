package caluculator;
import java.util.Scanner;

public class Calci {

	public static void main(String[] args) {
	int x,y;
	Scanner scan = new Scanner(System.in);
	while (true)
	{
		
 System.out.println("enter 1 add 2 sub 3 mul 4 div");
 int choice=scan.nextInt();
 System.out.println("enter the value of x:");
 x=scan.nextInt();
 System.out.println("enter the value of y:");
	y=scan.nextInt();
	
	switch(choice) {
	case 1:
		int add=x+y;
		System.out.println("the sum is"+add);break;
	case 2:
		int sub=x-y;
		System.out.println("the differnce is"+sub);break;
	case 3:
		int mul=x*y;
		System.out.println("the product is"+mul);break;
	case 4:
		int div=x/y;
		System.out.println("the division is"+div);break;
	case 0:
		System.exit(0);
		default:
			System.out.println("wrong choice");
	}
		
		
	}

	}

}
