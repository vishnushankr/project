package inheritance;

public class Hosteller {
	private String hostelname;
	private int roomnumber;
	private int phonenumber;

	public int getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getHostelname() {
		return hostelname;
	}

	public void setHostelname(String hostelname) {
		this.hostelname = hostelname;
	}

	public int getRoomnumber() {
		return roomnumber;
	}

	public void setRoomnumber(int roomnumber) {
		this.roomnumber = roomnumber;
	}

	public Hosteller(String hostelname, int roomnumber, int phonenumber) {
		super();
		this.roomnumber = roomnumber;
		this.phonenumber = phonenumber;
		this.hostelname = hostelname;
	}

	public void diplay() {
		System.out.println("hostelname=" + hostelname);
		System.out.println("roomnumber=" + roomnumber);
		System.out.println("modified phonenumber=" + phonenumber);

	}
}
