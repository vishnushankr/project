package multithreading;

public class Threadexample1 {

	public static void main(String[] args) {
		Thread tc = new Thread().currentThread();
		System.out.println(tc);
		tc.setName("vishnu");
		tc.setPriority(3);
		System.out.println(tc);
	}

}
