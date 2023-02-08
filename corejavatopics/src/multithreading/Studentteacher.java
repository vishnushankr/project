package multithreading;

class Board1{
	boolean vis=false;
	synchronized public void question(String i) {
		if(vis==true){
			try {
				wait();
				Thread.sleep(1000);//method of Object class. It works on state of Object
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
System.out.println("teacher asking  the question::"+i);
vis=true;
		notify();//method of Object class
	}

	public synchronized  void Answer(String i) {
		if(vis==false) {
			try {
				Thread.sleep(1000);
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("student giving answer::"+i);
		vis=false;
		notify();
			
		}
		
	}
	


class teacher implements Runnable{
	Board1 board;
String[] s1= {"good morning children","so tell me what is java?","what are OOPS concepts?",
		"what is thread?","what is synchronization?"};

	public teacher(Board1 board) {
		
		this.board = board;
		new Thread(this,"teacher").start();;
	}
	
	public void run(){
		for(int i=0;i<s1.length;i++) {
			board.question(s1[i]);
		}
	}

	
	}
	

class student implements Runnable{
	Board1 board;
	String[] s2= {"good morning teacher ","java is a object oriented programming language?","inhertance,polymorphism,encapsulation,abstraction",
			"thread is a line in a code","synchronization means controlling the thread"};

	public student(Board1 board) {
		
		this.board = board;
		new Thread(this,"student").start();
	}
	public void run() {
		for(int i=0;i<s2.length;i++) {
			board.Answer(s2[i]);
		}
	}
	
}
	
public class Studentteacher {

	public static void main(String[] args) {
Board1 b=new Board1();	
		new teacher(b);
		new student(b);
		
	}

}
