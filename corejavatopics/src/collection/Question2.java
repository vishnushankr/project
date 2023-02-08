package collection;

import java.util.Vector;

class Student1 {
	private String studentname;

	public Student1(String sudentname) {
		this.studentname = studentname;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	@Override
	public String toString() {
		return "Student1 [studentname=" + studentname + "]";
	}

}

class Teacher {
	private String Teachername;

	public Teacher(String Teachername) {
		this.Teachername = Teachername;
	}

	public String getTeachername() {
		return Teachername;
	}

	public void setTeachername(String teachername) {
		Teachername = teachername;
	}

	@Override
	public String toString() {
		return "Teacher [Teachername=" + Teachername + "]";
	}

}

class Hod {
	private String hodname;

	public Hod(String hodname) {
		this.hodname = hodname;
	}

	public String getHodname() {
		return hodname;
	}

	public void setHodname(String hodname) {
		this.hodname = hodname;
	}

	@Override
	public String toString() {
		return "Hod [hodname=" + hodname + "]";
	}

}

public class Question2 {
	public static void main(String[] args) {

		Vector<Student1> obj = new Vector<>();
		obj.add(new Student1("vishnu"));
		Vector<Teacher> obj1 = new Vector<>();
		obj1.add(new Teacher("shankar"));
		Vector<Hod> obj2 = new Vector<>();
		obj2.add(new Hod("shiva"));
		System.out.println(obj);
		System.out.println(obj1);
		System.out.println(obj2);

	}
}
