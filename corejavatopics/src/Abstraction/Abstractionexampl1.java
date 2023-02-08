package Abstraction;

abstract class microwave {
	private int temp;
	private int time;

	abstract void setemp();

	abstract void settime();

	void power() {
		System.out.println("on/off");
	}
}

class Biryani extends microwave {

	@Override
	void setemp() {
		System.out.println("temp is 100 degrees");
	}

	@Override
	void settime() {
		System.out.println("time is 15min");
	}
}

class Chicken extends microwave {

	@Override
	void setemp() {
		System.out.println("temp is 150 degress");
	}

	@Override
	void settime() {
		System.out.println("time is 35min");
	}

}

public class Abstractionexampl1 {

	public static void main(String[] args) {
		microwave obj = new Biryani();
		obj.setemp();
		obj.settime();

		microwave obj1 = new Chicken();
		obj1.setemp();
		obj1.settime();

	}

}
