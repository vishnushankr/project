package exceptionhandling;

public class Exceptionhandlingexample1 {

	public static void main(String[] args) {
		try {
			System.out.println(5 / 0);

			System.out.println("vishnu");
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("shankar");
	}
}
