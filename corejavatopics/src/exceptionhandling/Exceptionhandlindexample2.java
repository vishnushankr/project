package exceptionhandling;

public class Exceptionhandlindexample2 {

	public static void main(String[] args) {
		try {
			System.out.println(5 / 2);
			int a[] = { 5 };
			System.out.println(a[0]);
			int num = Integer.parseInt("A102");
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
