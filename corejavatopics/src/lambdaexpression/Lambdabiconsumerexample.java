package lambdaexpression;

import java.util.function.BiConsumer;

public class Lambdabiconsumerexample {

	/*static void showdetails(String name,Integer age) {
		System.out.println(name+" "+age);
	}*/
	
	public static void main(String[] args) {
/*BiConsumer<String,Integer> obj=Lambdabiconsumerexample::showdetails;
obj.accept("vishnu", 10);
obj.accept("shankar", 20);*/
		
		BiConsumer<String,Integer> obj=(name,age)->System.out.println(name+" "+age);
		obj.accept("vishnu", 10);
		obj.accept("shankar", 20);
	}

}
