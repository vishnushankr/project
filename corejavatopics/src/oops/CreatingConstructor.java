package oops;

public class CreatingConstructor {
	String name;
	int no;

	CreatingConstructor(String name, int no) {
		this.name = name;
		this.no = no;

	}

	void display() {
		System.out.println("name=" + name + " " + "no=" + no);
	}

	public static void main(String[] args) {
		CreatingConstructor obj = new CreatingConstructor("vishnu", 100);
		obj.display();
	}

}
