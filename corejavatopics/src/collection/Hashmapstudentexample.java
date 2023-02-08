package collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class student5{
	private int stdid;
	private String stdname;
	private int age;
	public student5(int stdid,String stdname,int age) {
		this.stdid=stdid;
		this.stdname=stdname;
		this.age=age;
		}
	public int getStdid() {
		return stdid;
	}
	public void setStdid(int stdid) {
		this.stdid = stdid;
	}
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

public class Hashmapstudentexample {

	public static void main(String[] args) {
Map<String,student5> studentmap=new HashMap<String,student5>();
student5 s1=new student5(100,"vishnu",20);
student5 s2=new student5(101,"shankar",21);
student5 s3=new student5(102,"madiseety",22);
studentmap.put("100", s1);
studentmap.put("101", s2);
studentmap.put("102", s3);
System.out.println(studentmap);
if(studentmap.containsKey("102")){
	student5 obj=studentmap.get("102");
	System.out.println(obj);
	System.out.println(obj.getStdname()+" "+obj.getAge());
	for(String key:studentmap.keySet()) {
		System.out.println(key);
	}
}
	}

}
