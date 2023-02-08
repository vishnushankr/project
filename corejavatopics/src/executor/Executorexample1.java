package executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executorexample1 {

	public static void main(String[] args) {
System.out.println("main thread as started");
//ExecutorService executors=Executors.newSingleThreadExecutor();
ExecutorService executors1=Executors.newFixedThreadPool(5);
for(int i=1;i<10;i++) {
	executors1.execute(new task());
}
	}

}
class task implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
