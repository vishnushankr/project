package string;

import java.util.Scanner;

//String methods
//1) length (), 2)isempty()  3)trim()

public class Stringpractice3 {
	
	public static void main(String[] args) {

		/*String name="vishnu";
		String email="vishn@gamil.com";
		String password ="vishnushankar";*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		String name=sc.next();
		System.out.println("enter the email");
		String email=sc.next();
		System.out.println("enter the password");
		String password=sc.next();
		
		System.out.println("length of the name is : "+name.length()); //length() method tells length of string 
		int i=name.length();  // the output will be in number form
		if(i==0) {            //condition
			System.out.println("name is empty");
		}
		else {
			System.out.println("valid name");
		}
		
		System.out.println("the name is empty "+name.isEmpty()); //checks weather the string is empty
			if(name.isEmpty()==true) {  //is empty() gives output in boolean value
				System.out.println("name is empty");
			}
			else {
				System.out.println("valid name");
			}
			
			
			String s=new String(name.trim());//trim() removes spaces
			System.out.println("the name after trim "+s);
			if(name.trim().length()==0) {
				System.out.println("name is empty");
			}
			else {
				System.out.println("valid name");
			}
		}
	}


