package exceptionhandling;

public class Execptionhandlingexample3 {
	static void getinfo() {
		System.out.println(5 / 0);
		int a[] = { 5 };
		System.out.println(a[0]);
	}

	public static void main(String[] args) {
		try {
			getinfo();
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();

		}
		System.out.println("vishnu");
	}

}
