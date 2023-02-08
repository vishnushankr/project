package string;

//== operator is used for reference comparison(address comparison)...
//.equals method of object class is used to compare the reference or address...

public class Stringpractice2 {

	public static void main(String[] args) {
		String s = new String("vishnu");
		String s1 = new String("vishnu");
		System.out.println(s == s1);
		System.out.println(s.equals(s1));
		
		String s2 = new String("shankar");
		String s3 = "shankar";
		System.out.println(s2 == s3); // == method
		System.out.println(s2.equals(s3)); // .equals method
		
		String s4 = new String("mahesh");
		String s5 = new String("suresh");
		System.out.println(s4.equals(s5));
		System.out.println(s4 == s5);

	}

}
