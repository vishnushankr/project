package string;

//searching methods in string 
//indexOf(),lastIndex(),contains(),charAt(),endsWith(),startsWith()

public class Stringpractice7 {

	public static void main(String[] args) {

		String s = "vishnushankar";

		// indexOf() gives integer value of character

		System.out.println(s.indexOf("s"));// 2
		System.out.println(s.indexOf('r'));// 12
		System.out.println(s.indexOf("sh"));// 2
		System.out.println(s.indexOf('y'));// -1

		// lastIndex() gives index value

		System.out.println(s.lastIndexOf("s"));// 6
		System.out.println(s.lastIndexOf("sh"));// 6
		System.out.println(s.lastIndexOf("ar"));// 11

        //charAt() gives string value

		System.out.println(s.charAt(2));// s
		System.out.println(s.charAt(10));// k
		System.out.println(s.charAt(5));// u

		// contains() gives boolean value

		System.out.println(s.contains("v"));// true
		System.out.println(s.contains("y"));// false
		
		//endsWith() gives boolean value
		
		System.out.println(s.endsWith("s"));//false
		System.out.println(s.endsWith("r"));//true
		
		
		//startsWith() gives boolean value
		
		System.out.println(s.startsWith("v"));//true
		System.out.println(s.startsWith("s"));//false

		

	}

}
