package inheritance;

public class Student {
	private int studentid;
	private String name;
	private int courseno;
	private String sex;
	private long phonenumber;

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCourseno() {
		return courseno;
	}

	public void setCourse(int courseno) {
		this.courseno = courseno;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}

	public Student(int studentid, String name, int courseno, String sex, long phonenumber) {
		this.studentid = studentid;
		this.name = name;
		this.courseno = courseno;
		this.sex = sex;
		this.phonenumber = phonenumber;
	}

	public void display() {
		System.out.println("studentid=" + studentid);
		System.out.println("name=" + name);
		System.out.println("courseno=" + courseno);
		System.out.println("sex=" + sex);
		System.out.println("phonenumber=" + phonenumber);

	}
}
