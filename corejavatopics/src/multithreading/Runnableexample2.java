package multithreading;

class Runnableexample2 implements Runnable {
	String name;

	public Runnableexample2(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println("new thread");
		System.out.println(name);

	}

	public static void main(String[] args) {
		Runnableexample2 obj = new Runnableexample2("vishnu");
		Thread obj1 = new Thread(obj);
		obj1.start();
		obj1.setPriority(2);
		System.out.println("main method");
	}

}
