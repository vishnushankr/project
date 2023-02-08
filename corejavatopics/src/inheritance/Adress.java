package inheritance;

public class Adress {

	private int houseno;
	private String city;

	public int getHouseno() {
		return houseno;
	}

	public void setHouseno(int houseno) {
		this.houseno = houseno;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Adress(int houseno, String city) {
		super();
		this.houseno = houseno;
		this.city = city;
	}

}