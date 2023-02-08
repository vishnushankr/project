
//Take capital of india as input and if it is not Delhi then throw an exception

package exceptionhandling;

import java.util.Scanner;

class capital extends Exception {

	public capital(String string) {
		// TODO Auto-generated constructor stub
	}

	public static boolean equalsIgnoreCase(String string) {
		// TODO Auto-generated method stub
		return false;
	}

}

public class Customexception {
	static void check(String capital) throws capital {
		String delhi;

	}

	public static void main(String[] args) throws capital {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the capital");
		String capital = scan.next();
		try {

			if (capital.equalsIgnoreCase("delhi")) {
				System.out.println("it is a capital");
			} else {
				throw new capital("wrong capital name");
			}

		} catch (capital e) {
			e.printStackTrace();
		}

	}
}
