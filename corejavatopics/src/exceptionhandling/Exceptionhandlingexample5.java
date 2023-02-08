package exceptionhandling;

public class Exceptionhandlingexample5 {

	public static void main(String[] args) {
		try {
			System.out.println(5 / 0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
	}
		 finally {
			System.out.println("vishnu");
		}
		System.out.println("shankar");
	}

}
