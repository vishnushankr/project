package lambdaexpression;

interface messege {
	void display(String msg);
}

public class Lambdaexample1 {

	public static void main(String[] args) {

		messege obj = (msg) -> System.out.println(msg);
		obj.display("hello");

	}

}
