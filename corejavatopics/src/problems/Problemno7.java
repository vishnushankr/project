//7.Java String valueOf Example

package problems;

public class Problemno7 {

	public static void main(String[] args) {
		int i = 10;
		float f = 10.0f;
		long l = 10;
		double d = 10.0d;
		char c = 'a';
		boolean b = true;
		Object o = new String("Hello World");

		System.out.println(String.valueOf(i));
		System.out.println(String.valueOf(f));
		System.out.println(String.valueOf(l));
		System.out.println(String.valueOf(d));
		System.out.println(String.valueOf(c));
		System.out.println(String.valueOf(b));
		System.out.println(String.valueOf(o));

	}

}
