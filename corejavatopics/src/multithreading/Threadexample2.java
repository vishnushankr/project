package multithreading;

public class Threadexample2 {

	public static void main(String[] args) {
		Thread t1 = new Thread().currentThread();
		System.out.println(t1);
		t1.setName("vishnushankar");
		t1.setPriority(4);
		System.out.println(t1);
		System.out.println("id is " + t1.getId());
		System.out.println(t1.equals(t1));
		System.out.println("process is " + t1.isAlive());
		System.out.println("state is " + t1.getState());
	}

}
