package collection;

import java.util.ArrayList;

class details {
	private String name;
	private String emailadress;
	private String postaladdress;

	public details(String name, String emailaddress,String postaladdress) {
		this.emailadress = emailaddress;
		this.name = name;
		this.postaladdress=postaladdress;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailadress() {
		return emailadress;
	}

	public void setEmailadress(String emailadress) {
		this.emailadress = emailadress;
		
	}

	public String getPostaladdress() {
		return postaladdress;
	}

	public void setPostaladdress(String postaladdress) {
		this.postaladdress = postaladdress;
	}





}

public class Question3 {

	public static void main(String[] args) {
		ArrayList<details> obj = new ArrayList<>();
obj.add(new details("vishnu","vishnu@gmail.com",null));
obj.add(new details("shankar",null,"indore"));
obj.add(new details("manikanta",null,"lingojuguda"));
obj.add(new details("shiva",null,"hyderabad"));
obj.add(new details("manjuanth","manjuu@gmail.com",null));
obj.add(new details("pruthvi","pruthvi@gmail.com",null));


		
		for (details vis : obj) {
			if(vis.getEmailadress()!=null) {
				System.out.println("the invitation sent through email");
				System.out.println(vis.getEmailadress());
		}
			if(vis.getPostaladdress()!=null) {
				System.out.println("the invitation sent through postaladdress");
				System.out.println(vis.getPostaladdress());
			}
		
		}

	}
}


