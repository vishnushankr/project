package string;

//String methods
//1)equals() 2)equalsIgnorecase() 3)compareTo() 4)compareToIgnorecase()

public class Stringpractice4 {

	public static void main(String[] args) {
String s="vishnu";
String s1="Vishnu";
String s2="vishnu";
String s3="shankar";
String s4="VISHNU";   

//equals() gives boolean value true or false

System.out.println(s.equals(s4));//false because case sensitive
System.out.println(s.equals(s2));//true because both are same 
System.out.println(s.equals(s1));//false because v is case sensitive
System.out.println(s.equals(s3));//false because of different Strings

//equalsIgnorecase() gives boolean true or false

System.out.println(s.equalsIgnoreCase(s1));//true because it ignores case sensitive
System.out.println(s.equalsIgnoreCase(s4));//true
System.out.println(s.equalsIgnoreCase(s2));//true
System.out.println(s.equalsIgnoreCase(s3));//false because the two strings are different

//compareTo() gives Integer value

System.out.println(s.compareTo(s1));//32 because it is case senstive
System.out.println(s.compareTo(s2));//0 because both are same
System.out.println(s.compareTo(s3));//3 same case sensitive
System.out.println(s.compareTo(s4));//32 beacuse it is case sensitive

//compareToIgnorecase() gives Integer value

System.out.println(s.compareToIgnoreCase(s1));//0 because this ignores case sensitive
System.out.println(s.compareToIgnoreCase(s2));//0 because this ignores case sensitive
System.out.println(s.compareToIgnoreCase(s3));//3 because the two strings are different
System.out.println(s.compareToIgnoreCase(s4));//0 because this ignores case sensitive
	}

}
