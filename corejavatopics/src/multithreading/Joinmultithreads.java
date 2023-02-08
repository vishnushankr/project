package multithreading;

class Mythreadss extends Thread {
	public void run() {
		for (int i = 1; i < 5; i++) {
			System.out.println(this.getName());
			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Joinmultithreads {

	public static void main(String[] args) {
		Mythreadss obj1 = new Mythreadss();
		obj1.start();
		Mythreads obj2 = new Mythreads();
		obj2.start();
		try {
			obj1.join();
			obj2.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}

}
