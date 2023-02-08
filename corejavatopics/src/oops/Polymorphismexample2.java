package oops;
//method Overriding is an runtime polymorphism
//it occurs when same method name in different class

class poly{
	void show() {
	
		System.out.println("vishnu");
	}
}
public class Polymorphismexample2 extends poly{
	//@Override
void show() {
	System.out.println("shankar");
}
	public static void main(String[] args) {
		Polymorphismexample2 obj=new Polymorphismexample2();
		obj.show();
		//obj.show();
	}

}
