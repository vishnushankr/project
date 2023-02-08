package Abstraction;

interface project {
	void requirements();

	void design();
}

interface testing {
	void tools();

}

class Application implements project, testing {

	@Override
	public void tools() {
		System.out.println("tools");
	}

	@Override
	public void requirements() {
		System.out.println("requitements");
	}

	@Override
	public void design() {
		System.out.println("design");
	}

}

public class Interfaceexample2 {

	public static void main(String[] args) {
		Application obj = new Application();
		obj.design();
		obj.requirements();
		obj.tools();

	}

}
