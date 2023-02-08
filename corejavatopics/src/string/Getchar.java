package string;

public class Getchar {

	public static void main(String[] args) {
		String s = "this is vishnu";
		char a[] = new char[5];
		s.getChars(2, 6, a, 1);
		System.out.println(a);
	}

}
