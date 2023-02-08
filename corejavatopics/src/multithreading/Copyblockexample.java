package multithreading;

class table {
	synchronized void printtable(int n) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class Mythread7 extends Thread {
	table t;

	Mythread7(table t) {
		this.t = t;
	}

	public void run() {
		t.printtable(10);
	}

}

class Mythread8 extends Thread {
	table t;

	Mythread8(table t) {
		this.t = t;
	}

	public void run() {
		t.printtable(5);
	}
}

public class Copyblockexample {

	public static void main(String[] args) {
		table obj = new table();
		Mythread7 obj1 = new Mythread7(obj);
		Mythread8 obj2 = new Mythread8(obj);

		obj1.start();
		obj2.start();
	}

}
