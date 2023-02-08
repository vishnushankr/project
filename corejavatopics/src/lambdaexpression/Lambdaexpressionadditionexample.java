package lambdaexpression;

interface vishnu {
	int addition(int a, int b);
}

public class Lambdaexpressionadditionexample {

	public static void main(String[] args) {
		vishnu vis = (a, b) -> a + b;
		System.out.println(vis.addition(2, 3));
	}

}
