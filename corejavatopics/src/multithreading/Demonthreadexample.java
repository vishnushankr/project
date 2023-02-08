package multithreading;

public class Demonthreadexample extends Thread {
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("it is executing");
		} else {
			System.out.println("it is not executing");
		}
	}

	public static void main(String[] args) {
		Demonthreadexample obj = new Demonthreadexample();
		Demonthreadexample obj1 = new Demonthreadexample();
		obj.setDaemon(true);
		obj.start();
		obj1.start();

	}

}
