package multithreading;

/*class board {
	synchronized void main(String a[]) {
		for (int i = 1; i < a.length; i++) {
			System.out.println(a[i]);
			try {
				Thread.sleep(1500);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

}

class Teacherthread extends Thread {
	board b;
	String teachernames[] = { "vishnu", "shankar", "shiva", "mani" };

	Teacherthread(board b) {
		this.b = b;
	}

	public void run() {
		System.out.println(teachernames);
	
	}
}

class Studentthread extends Thread {
	board b;
	String studentnames[] = { "ashwath", "sai", "ram" };

	Studentthread(board b) {
		this.b = b;
	}

	public void run() {
		System.out.println(studentnames);
	}
}

public class Synchronizedexample2 {

	public static void main(String[] args) {
		board b = new board();
		Teacherthread obj1 = new Teacherthread(b);
		Studentthread obj2 = new Studentthread(b);
		obj1.start();
		obj2.start();
	}
}*/

public class Synchronizedexample2 {
	public static void main(String[] args) {
		Board board=new Board();
		TeacherThread t1=new TeacherThread(board);
		StudentThread s1=new StudentThread(board);
		
		t1.start();
		s1.start();
	}
}
class TeacherThread extends Thread{
	Board board;
	String teachernames[]={"Mrs Mamta", "Mr Bipin", "Miss Komal"};
	TeacherThread(Board board){
		this.board=board;
	}
	
	public void run(){
		board.print(teachernames);
	}
}
class StudentThread extends Thread{
	Board board;
	String studentnames[]={"Nisha", "Nilesh", "Nitin", "Niranjan"};
	StudentThread(Board board){
		this.board=board;
	}
	
	public void run(){
		board.print(studentnames);
	}
}
class Board{
	
	synchronized void print(String arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
	