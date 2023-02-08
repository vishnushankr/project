package executor;

public class Runnableexample {

	public static void main(String[] args) {
System.out.println("main thread has started");
Runnable task=()->{
	System.out.println(Thread.currentThread().getName());
};
new Thread(task).start();
	}

}
