package collection;

import java.util.HashMap;
import java.util.Map;

class student123{
	int stdid;
	String name;
	int age;
	student123(int stdid,String name,int age){
		this.stdid=stdid;
		this.name=name;
		this.age=age;
		
	}
	public int getStdid() {
		return stdid;
	}
	public void setStdid(int stdid) {
		this.stdid = stdid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	 
}

public class Hashmapstudentexample2 {

	public static void main(String[] args) {
Map<String,student123> obj=new HashMap<String,student123>();
student123 s1=new student123(10,"vishnu",21);
student123 s2=new student123(11,"shankar",22);
student123 s3=new student123(12,"shiva",23);
obj.put("s1", s1);
obj.put("s2", s2);
obj.put("s3", s3);
System.out.println(obj.size());
System.out.println(obj);
for(String key:obj.keySet()){
	student123 s=obj.get(key);
	System.out.println(s.getName()+" "+s.getAge());
}

	}

}
