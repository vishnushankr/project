package string;

//concat(),join(),subSequence(),substring().

public class Stringpractice5 {

	public static void main(String[] args) {
		String s = "vishnu";
		String s1 = "shankar";

//concat() is used to join two Strings..

		System.out.println(s.concat(s1));// vishnushankar
		System.out.println(s + s1);// vishnushankar
		System.out.println(10 + s);// 10vishnu
		System.out.println(10 + s + 20 + s1);// 10vishnu20shankar
//System.out.println(s+10-20);//it not takes the value of negative

//join() is used add and join the Strings

		System.out.println(String.join(";", s, s1));// join joins the String and divide by the another string in a
													// given string....
		System.out.println(String.join("/", s, s1, s));// join joins the String and divide by the another string in a
											// given string....
		
		String s2="hi this is vishnu";
		
	//subSequence() find the sequence
		System.out.println("subswquence------");
		System.out.println(s.subSequence(1, 4));
		System.out.println(s.subSequence(2, 4));
		System.out.println(s1.subSequence(1, 3));
		System.out.println(s1.subSequence(1, 1));
		System.out.println(s2.subSequence(3, 10));


//substring() 
		
		String s3="abcde";
		System.out.println(s3.substring(1, 3));
		
		System.out.println(s.substring(2));
		System.out.println(s.substring(3));
		System.out.println(s1.substring(2, 3));		
		System.out.println(s1.substring(1, 3));
		System.out.println(s2.substring(3, 8));


		

	}

}
