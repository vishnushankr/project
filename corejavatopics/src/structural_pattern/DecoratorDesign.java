package structural_pattern;

interface Icecream {
	  public String makeIcecream();
	}
class SimpleIcecream implements Icecream {

	  @Override
	  public String makeIcecream() {
	    return "Base Icecream";
	  }

	}
abstract class IcecreamDecorator implements Icecream {

	  protected Icecream specialIcecream;

	  public IcecreamDecorator(Icecream specialIcecream) {
	    this.specialIcecream = specialIcecream;
	  }

	  public String makeIcecream() {
	    return specialIcecream.makeIcecream();
	  }
	}
class NuttyDecorator extends IcecreamDecorator {

	  public NuttyDecorator(Icecream specialIcecream) {
	    super(specialIcecream);
	  }

	  public String makeIcecream() {
	    return specialIcecream.makeIcecream() + addNuts();
	  }

	  private String addNuts() {
	    return " + cruncy nuts";
	  }
	}
class HoneyDecorator extends IcecreamDecorator {

	  public HoneyDecorator(Icecream specialIcecream) {
	    super(specialIcecream);
	  }

	  public String makeIcecream() {
	    return specialIcecream.makeIcecream() + addHoney();
	  }

	  private String addHoney() {
	    return " + sweet honey";
	  }
	}

class strawberryDectorator extends IcecreamDecorator{

	public strawberryDectorator(Icecream specialIcecream) {
		super(specialIcecream);
	}
	public String makeIcecream() {
		return specialIcecream.makeIcecream()+ addstrawberry();
	}
	private String addstrawberry() {
		return "+ strawberry";
	}
	}
	

public class DecoratorDesign {

	  public static void main(String args[]) {
	    Icecream icecream = new strawberryDectorator(new HoneyDecorator(new SimpleIcecream()));
	    System.out.println(icecream.makeIcecream());
	  }

}
