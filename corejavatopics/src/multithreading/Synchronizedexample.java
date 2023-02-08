package multithreading;

class account {
	int bal;

	public synchronized void deposit(int amount) {
		bal += amount;
	}

	public synchronized void withdraw(int amount) {
		bal -= amount;
	}

	public synchronized void enquire() {
		System.out.println(bal);
	}
}

class mythread6 implements Runnable {
	account a;

	public mythread6(account s) {
		a = s;
	}

	public void run() {
		a.deposit(1000);
		a.enquire();
	}

}

class yourthread implements Runnable {
	account a;

	public yourthread(account s) {
		a = s;
	}

	public void run() {
		a.withdraw(500);
		a.enquire();
	}
}

class herthread implements Runnable {
	account a;

	public herthread(account s) {
		a = s;
	}

	public void run() {
		a.enquire();
	}
}

public class Synchronizedexample {

	public static void main(String[] args) {
		account obj = new account();
		Thread obj1 = new Thread(new mythread6(obj));
		Thread obj2 = new Thread(new yourthread(obj));
		Thread obj3 = new Thread(new herthread(obj));
		obj1.start();
		obj2.start();
		obj3.start();
		obj1.setPriority(6);
		obj2.setPriority(5);
		obj3.setPriority(1);
		try {
			obj1.join();
			obj2.join();
			obj3.join();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}