package string;

import java.util.Scanner;

public class Validation {

	public boolean check(String userid, String password) {
		if (userid.equalsIgnoreCase("vishnu") && password.equals("shankar"))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Validation obj = new Validation();
		int i = 1;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("enter userid");
			String userid = sc.next();
			System.out.println("enter password");
			String password = sc.next();
			if (obj.check(userid.trim(), password.trim())) {
				System.out.println("welcome");
				break;
			} else {
				if (i != 3)
					System.out.println("your password is in correct");

			}
			i++;
		} while (i <= 3);

	}
}
