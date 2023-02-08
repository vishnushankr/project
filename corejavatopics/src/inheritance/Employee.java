package inheritance;

public class Employee {
	private String name;
	private Adress adr;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Adress getAdr() {
		return adr;
	}

	public void setAdr(Adress adr) {
		this.adr = adr;
	}

	public Employee(String name, Adress adr) {
		super();
		this.name = name;
		this.adr = adr;

	}

	public void display() {
		System.out.println("name" + name);
		System.out.println("Adress=" + adr.getHouseno() + "," + adr.getCity());
	}
}
