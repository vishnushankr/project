package string;

//declare of string and printing of string.....
//by using bytes,char,string...

public class Stringpractice1 {

	public static void main(String[] args) {
		char[] ch = { 'a', 'b', 'c', };//char
		String sc=new String(ch); //converting char to string
		System.out.println(sc);
		
		byte[] b= {101,102,103};   //byte
		String sb=new String(b);    //converting byte to String
		System.out.println(sb);

		String s = new String("vishnu");
		String s1 = "shankar"; 
		String s2 = new String("vishnu"); // one object
		String s3 = "shankar"; // two objects
		System.out.println(s + " " + s1 + " " + s2 + " " + s3);
		
		
		StringBuffer sb1=new StringBuffer("vishnu");//mutable
		String s4=new String(sb1);//immutable  (changing mutable to immutable)
		System.out.println(sb1);
		
	}

}
