package problems;

import java.util.*;

class Mycurentdate implements Runnable {

	Date date = new Date();

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(date);
		}
		try {
			Thread.sleep(100);
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

}

public class Mymain {

	public static void main(String[] args) {
		Thread t = new Thread(new Mycurentdate());
		Thread t1 = new Thread(new Mycurentdate());
		Thread t2 = new Thread(new Mycurentdate());
		t.setName("the first instance ");

		t1.setName("the second instance");

		t2.setName("the third instance");
		System.out.println(t.getName());
		t.start();
		try {
			t.join();
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println(t1.getName());
		t1.start();
		try {
			t1.join();
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println(t2.getName());
		t2.start();

	}

}
