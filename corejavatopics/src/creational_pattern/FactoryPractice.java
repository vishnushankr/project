package creational_pattern;

abstract class school{
	protected double fee;
	abstract void getfee();
	public void totalfee(int ui) {
		System.out.println(fee*ui);
	}
}
class ninth extends school{

	//@Override
	public void getfee() {
		fee=2000;
	}
	
}
class tenth extends school{

	//@Override
	void getfee() {
fee=3000;		
	}
	
}

class factory{
	public school getclass(String str) {
		if(str.equalsIgnoreCase("ninth")) {
			return new ninth();
		}
		else if(str.equalsIgnoreCase("tenth")){
			return new tenth();
		}else
		return null;
		
	}
}

public class FactoryPractice {
	public static void main(String args[]) {
factory obj=new factory();
school scl=obj.getclass("ninth");
scl.totalfee(120);;
}
}
