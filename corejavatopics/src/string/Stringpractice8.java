package string;

//String conversion
// case conversion methods are toUpperCase(),toLowerCase()
//type conversion methods are String-valueOf(),toCharArray()

public class Stringpractice8 {

	public static void main(String[] args) {
	
String s="MY name is VishnuShankar";

//toUpperCase changes String in to Capital letters..
//toLowerCase changes String in to small letters...

System.out.println(s.toUpperCase());//MY NAME IS VISHNUSHANKAR
System.out.println(s.toLowerCase());//my name is vishnushankar

//valueOf changes into string

int a=10,b=20;
System.out.println(a+b);//30 because here no type conversion
String s1=String.valueOf(a);
String s2=String.valueOf(b);
System.out.println(s1+s2);//1020 because of here int changes in to string

//toCharArray

char[] ch=s.toCharArray();
System.out.println(ch);



	}

}
