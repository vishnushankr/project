package exceptionhandling;

public class Exceptionhandlingexample4 {
	static void getinfo() {  //throws ArithmeticException, ArrayIndexOutOfBoundsException {
		System.out.println(5 / 0);
		int a[] = { 5 };
		System.out.println(a[0]);
		int num = Integer.parseInt("A102");
	}

	public static void main(String[] args) {
		try {
			getinfo();
		}// catch (ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException e) {
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("vishnu");
	}

}
