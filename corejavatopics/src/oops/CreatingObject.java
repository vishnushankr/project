package oops;

//object is the parent class of all classes

public class CreatingObject {

	void display() {
		System.out.println("this is object");
	}

	public static void main(String[] args) {

		CreatingObject obj = new CreatingObject();// we create object by using new keyword

		obj.display();// we are displaying the objects using object obj
	}

}
