package oops;
class car{
	void show() {
		System.out.println("audi");
	}
}
	class colour extends car{
		void show() {
			System.out.println("the colour of the car is red");
		}
	}
		class engine extends car{
			void show() {
				System.out.println("the engine takes petrol");
			}
		}
	

public class Heirarchicalexample {

	public static void main(String[] args) {
car c=new car();
c.show();

colour c1=new colour();
c1.show();

engine e=new engine();
e.show();
	}

}
