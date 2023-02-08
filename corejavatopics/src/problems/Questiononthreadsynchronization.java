package problems;

import java.util.ArrayList;

class school{
	ArrayList<Integer> a=new ArrayList<>();
	synchronized void add() {
	for(int i=1;i<5;i++) {
		a.add(i);
	}
}

synchronized void show() {
	System.out.println("hello");
	for(int i=0;i<a.size();i++) {
		System.out.println(a.get(i));
	}
}
}
class vis extends Thread{
	school s;
	vis(school s){
		this.s=s;
	}
	public void run() {
	s.add();
	}
}
class sha extends Thread{
	school s;
	sha(school s){
		this.s=s;
	}
	public void run() {
		s.show();
	}
}
public class Questiononthreadsynchronization {
	public static void main(String[]args) {
		school obj=new  school();
		vis t1=new  vis(obj);
		t1.start();
		sha t2 =new  sha(obj);
		t2.start();
	}
}
	

