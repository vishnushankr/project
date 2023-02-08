package oops;
//method overloading is an compile time Polymorphism...
//it occurs when same method name in same class
/*public class Polymorphismexample {
	void show() {
		System.out.println("this is method ovreloading");
	}
    void show(int i) {
    	System.out.println("hi");
    }
	public static void main(String[] args) {
	
	
	Polymorphismexample obj=new Polymorphismexample();
	//obj.show();
	obj.show(0);

}
}*/

public class Polymorphismexample {
    
    void display() {
        System.out.println("this is methodovereloading");
    }
    
    void display(String name) {
        System.out.println("hi ");
    }

    public static void main(String[] args) {
      Polymorphismexample p=new Polymorphismexample();
      p.display();
     // p.display("v");
    }

}

