package Introduction;

import java.util.Scanner;

public class Conditionalst {

	public static void main(String[] args) {
//what is java?
//data type and how to store the datatypes
//how to implement the operators and switch...
		//conditional statements...
		//if,ifelse,else.switch,datatypes,operators,loops 	
		Scanner deepika=new Scanner(System.in);
		System.out.println("enter the value of a");
		int a=deepika.nextInt();
		System.out.println("enter the value of b");
		int b=deepika.nextInt();
		System.out.println("enter the value of c");
        int c=deepika.nextInt();
		/*int a=23;
		int b=34;
		int c=19;*/
		if(a>b && a>c) {
			System.out.println("A is greater");
		}
		else if(b>c){
			System.out.println("B is greater");
		}
		else {
			System.out.println("C is greater");
		}
				
	}

}
