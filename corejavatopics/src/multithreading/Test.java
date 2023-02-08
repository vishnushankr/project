package multithreading;

import java.util.ArrayList;

class Resource{
	ArrayList<Integer> list=new ArrayList<>();
	synchronized public void generateUnit(int i) {
		if(!list.isEmpty()){
			try {
				wait();//method of Object class. It works on state of Object
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		list.add(i);
System.out.println("Produce::"+list);
		notify();//method of Object class
	}

	synchronized public void consumeUnit() {
		if(list.isEmpty()){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Consume::"+list);
		list.clear();
		notify();
	}
	
}

class Producer extends Thread{
	Resource resource;

	public Producer(Resource resource) {
		
		this.resource = resource;
		this.start();
	}
	
	public void run(){
		for(int i=1;i<=5;i++){
			resource.generateUnit(i);
		}
	}
	
}
class Consumer extends Thread{
	Resource resource;

	public Consumer(Resource resource) {
		
		this.resource = resource;
		this.start();
	}
	public void run(){
		for(int i=1;i<=5;i++){
			resource.consumeUnit();
		}
	}
	
}
	

public class Test {

	public static void main(String[] args) {
		Resource resource=new Resource();	
		Consumer t1 = new Consumer(resource);
		Producer t2 = new Producer(resource);
		}

}
