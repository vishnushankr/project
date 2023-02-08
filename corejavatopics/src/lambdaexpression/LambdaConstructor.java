package lambdaexpression;

interface vishnu1 {
	void vis();
}

interface shankar {
	sha msg(String s);
}

class sha {
	sha() {
		System.out.println("default constructor");
	}

	sha(String str) {
		System.out.println(str);
	}
}

public class LambdaConstructor {

	public static void main(String[] args) {

		vishnu1 obj = sha::new;
		obj.vis();
		shankar obj2 = sha::new;
		obj2.msg("vishnu");
	}
}
