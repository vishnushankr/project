package lambdaexpression;

interface Calci {
	int cal(int a, int b);
}

interface display {
	void show();
}

public class Lambdaexpressionaddtion {

	public static void main(String[] args) {
		Calci obj = (a, b) -> {
			if (b != 0) {
				return a / b;
			} else {
				return 0;
			}
		};
		System.out.println(obj.cal(10, 20));

		Calci obj2 = (a, b) -> a + b;
		System.out.println(obj2.cal(10, 20));

		display d = () -> System.out.println("hello");
		d.show();
	}

}
