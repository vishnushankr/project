package oops;

abstract class rrr{
	//private String name;
	//private String character;
	 abstract void name();
	abstract void charcater();
	
}



public class Abstractionclassexample extends rrr {

	

	@Override
	void name() {
System.out.println("name of the hero is NTR ");		
System.out.println("name of another hero is RamCharan");
	}

	@Override
	void charcater() {
System.out.println("the character of NTR is bheem");
System.out.println("the character of Ramcharan seetharamaraju");
	}
	public static void main(String[] args) {
		Abstractionclassexample obj=new Abstractionclassexample();
		obj.name();
		obj.charcater();
	}

}
