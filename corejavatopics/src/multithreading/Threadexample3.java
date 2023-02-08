package multithreading;

class mythread10 extends Thread {
	public void run() {
		System.out.println(this.getId());
	}

}

public class Threadexample3 {

	public static void main(String[] args) {
		mythread10 obj = new mythread10();
		obj.setName("vishnu");
		obj.setPriority(1);
		System.out.println(obj);
		obj.start();
		System.out.println("main method");
	}

}
