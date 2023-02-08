package oops;

class name  {

	String name = "vishnu";
}
class age extends name {
	String name = "shankar";
}
public class Multilevelinheritance extends age{
	String name = "vishnushankar";


	public static void main(String[] args) {
		Multilevelinheritance a = new Multilevelinheritance();
		name n=new name();
		age a1=new age();
		System.out.println(a.name);
		System.out.println(n.name);
		System.out.println(a1.name);

	}

}
