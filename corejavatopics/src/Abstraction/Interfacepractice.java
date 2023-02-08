package Abstraction;

interface fulltime {
	void testing();

	void developer();
}

interface traine {
	void sql();

	void java();
}

class Office implements fulltime, traine {

	@Override
	public void sql() {
		System.out.println("sql is over");
	}

	@Override
	public void java() {
		System.out.println("java is over");
	}

	@Override
	public void testing() {
		System.out.println("testing is completed");
	}

	@Override
	public void developer() {
		System.out.println("developing is completed");
	}

}

public class Interfacepractice {

	public static void main(String[] args) {
		Office obj = new Office();
		obj.sql();
		obj.java();
		obj.testing();
		obj.developer();
	}

}
