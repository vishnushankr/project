package string;

//StringBuffer 

public class Stringpractice9 {

	public static void main(String[] args) {

		StringBuffer s=new StringBuffer();
		StringBuffer sb=new StringBuffer("vishnu");
		StringBuffer sb1=new StringBuffer("vishnu");
		StringBuffer sb2=new StringBuffer("Vishnu");
		
		//capacity()
		
		System.out.println(s.capacity());//the defaults capacity is 16
		System.out.println(sb.capacity());//16+6=22 //capacity tells how much capacity to store the String
		
		//length()
		
		System.out.println(s.length());//0 the length of string is zero here
		System.out.println(sb.length());//6 the lenght of string is 6.
		
		//equals()
		
		System.out.println(sb.equals(sb2));//false
		System.out.println(sb.equals(sb1));//false
		
		//indexof()
		
		System.out.println(sb.indexOf("i"));//1
		
		//lastindexof()
		
		System.out.println(sb.lastIndexOf("h"));//3
		
		//append()
		
		System.out.println(s.append("shankar"));//shankar this is like a concat in string.
		System.out.println(sb.append("shankar"));//vishnushankar.
		
		//charat()
		
		System.out.println(sb.charAt(2));//s gives string value
		
		//delete()
		
		System.out.println(sb.delete(1, 2));// i is deleted vshnushankar
		
		//deletecharat()
		
		System.out.println(sb.deleteCharAt(5));// s is deleted vshnuhankar
		
		//insert()
		
System.out.println(sb1.insert(5, 's'));//vishnsu
		
//replace()

System.out.println(sb1.replace(1, 2, "s"));//vsshnsu

//reverse()

System.out.println(sb.replace(1, 3, "e"));//venushankar

//subsequence()

System.out.println(sb1.subSequence(2, 3));//s


//substring

System.out.println(sb1.substring(1, 3));//ss
System.out.println(sb1.substring(2));//shnsu





		
		
		
		
		
		
		
		
		
	}

}
