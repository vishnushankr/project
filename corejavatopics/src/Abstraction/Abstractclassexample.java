package Abstraction;
abstract class poly1{

	private int age;
	private String name;
abstract void show();
}
 class Abstractclassexample extends poly1{

	

	@Override
	void show() {
		System.out.println("name is vishnu");
		System.out.println("age is 22");
		
	}
	public static void main(String[] args) {
		Abstractclassexample obj=new Abstractclassexample();
		obj.show();
	}

}
