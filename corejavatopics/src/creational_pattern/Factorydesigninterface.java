package creational_pattern;

 interface House{
	public void getrent();
}
class singlebedroom implements House{

	@Override
	public void getrent() {
System.out.println("10000");		
	}
	
}
class doublebedroom implements House{

	@Override
	public void getrent() {
System.out.println("20000");		
	}
	
}
class factory1{
	public House gettype(String str) {
		if(str.equalsIgnoreCase("singlebedroom")) {
			return new singlebedroom();
		}
		else if(str.equalsIgnoreCase("doublebedroom")) {
			return new doublebedroom();
		}
		
		return null;
		
	}

}
 
public class Factorydesigninterface {

	public static void main(String[] args) {
factory1 obj=new factory1();
House hu=obj.gettype("doublebedroom");
hu.getrent();
	}

}
