package multithreading;

/*class table1 {
	void printtable(int n, Thread t) {
		synchronized (this) {
			for (int i = 1; i < 5; i++) {
				System.out.println(t.getId());
				System.out.println(n * i);
				try {
					Thread.sleep(400);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}
		synchronized (this) {
			for (int i = 1; i < n; i++) {
				System.out.println("hello");
			}
		}
	}
}

class Mythread extends Thread {
	table1 t;

	Mythread(table1 t) {
		this.t = t;
	}

	public void run() {
		t.printtable(5, this);
	}
}

class Mythread1 extends Thread {
	table1 t;

	Mythread1(table1 t) {
		this.t = t;
	}

	public void run() {
		t.printtable(2, this);
	}
}

public class Blocksynchronizedexample {

	public static void main(String[] args) {
		table1 obj = new table1();
		Mythread obj1 = new Mythread(obj);
		Mythread obj2 = new Mythread(obj);
		obj1.start();
		obj2.start();
	}

}*/

class Table1{

	  void printTable(int n, Thread t){
	   
		
		synchronized (this) {
		
		     for(int i=1;i<=5;i++){
	    	 System.out.println("Thread id="+t.getId()+": ");
	      System.out.println(n*i);
	      try{
	       Thread.sleep(400);

	      }catch(Exception e){System.out.println(e);}
	     }
		 }//First Block end
	   
		
			
		synchronized (this) {
	     for(int i=1;i<=n;i++){
	    	 System.out.print("Thread id="+t.getId()+": ");
	    	 System.out.println("Hello");
	     }
		}//Second Block End
	 
	 }
	     
	}
	 
	class MyThread5 extends Thread{
		Table1 t;
		MyThread5(Table1 t){
		this.t=t;
		}

		public void run(){
		t.printTable(5,this);
		}

	}

	class MyThread4 extends Thread{
		Table1 t;
		MyThread4(Table1 t){
		this.t=t;
		}
		public void run(){
		t.printTable(2,this);
		}
	}

	public class BlockSynchronizedexample{
	public static void main(String args[]){
	Table1 obj = new Table1();//only one object
	MyThread5 t1=new MyThread5(obj);
	MyThread4 t2=new MyThread4(obj);
	t1.start();
	t2.start();
	}
	}

