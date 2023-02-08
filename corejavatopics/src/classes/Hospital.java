package classes;

public class Hospital {
	private String patientname;
	private int patientid;
	private String patientaddress;
	public  Hospital(String patientname,int pateintid,String patientaddress) {
		this.patientname=patientname;
		this.patientid=patientid;
		this.patientaddress=patientaddress;
	}
	

	public String getPatientname() {
		return patientname;
	}


	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}


	public int getPatientid() {
		return patientid;
	}


	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}


	public String getPatientaddress() {
		return patientaddress;
	}


	public void setPatientaddress(String patientaddress) {
		this.patientaddress = patientaddress;
	}


	public static void main(String[] args) {
Hospital obj=new Hospital("vishnu",100,"hyderabad");

System.out.println("patientname is : "+obj.getPatientname());
System.out.println("patientid is : "+obj.getPatientid());
System.out.println("patientaddress is : "+obj.getPatientaddress());


	}

}
