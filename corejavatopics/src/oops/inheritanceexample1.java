package oops;

class child2	{
	void show() {
		System.out.println("this is parent class");
	}
}

class inheritanceexample1 extends child2 {
	void display() {
		System.out.println("this is child class");
	}

	public static void main(String[] args) {
		child2 ch = new child2();
		//ch.display();
		ch.show();
		inheritanceexample1 obj1=new inheritanceexample1();
		obj1.display();
		obj1.show();

	}

}
