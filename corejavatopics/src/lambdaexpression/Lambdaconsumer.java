package lambdaexpression;

import java.util.function.Consumer;

public class Lambdaconsumer {

	public static void main(String[] args) {

		Consumer<String> obj=(name)->System.out.println(name);
		obj.accept("vishnu");
		obj.accept("shankar");
		
	}

}
