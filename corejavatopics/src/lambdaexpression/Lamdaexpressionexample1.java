package lambdaexpression;

interface numbers {
	void display(int num1, int num2);
}

public class Lamdaexpressionexample1 {

	public static void main(String[] args) {

		numbers obj = (num1, num2) -> System.out.println(num1 + " " + num2);

		obj.display(10, 20);
	}

}
