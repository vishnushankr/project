package multithreading;

class mynewthread implements Runnable{
	@Override
	public void run() {
		System.out.println("this is new thread");
	}
}

public class Runnableexample {

	public static void main(String[] args) {
mynewthread obj=new mynewthread();
Thread t=new Thread(obj);
t.start();
System.out.println("main method");

	}

}
