package executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Executorscheduleexample {

	public static void main(String[] args) {
System.out.println("main thread as started");
ScheduledExecutorService executors=Executors.newScheduledThreadPool(1);
for(int i=1;i<10;i++) {
	executors.schedule(new task1(), i, TimeUnit.SECONDS);
	executors.shutdown();
	System.out.println("main thread is completed");
}
	}

}
class task1 implements Runnable{

	@Override
	public void run() {
System.out.println(Thread.currentThread().getName());		
	}
	
}
