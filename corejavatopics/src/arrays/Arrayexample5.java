package arrays;

public class Arrayexample5 {

	public static void main(String[] args) {
		try{int a[] = new int[10];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		a[5] = 60;
		a[6] = 70;
		a[7] = 90;
		a[8] = 100;
		a[9] = 110;

		for (int i = 0; i <= a.length; i++) {
			System.out.println(a[i]);
		}
	}catch(Exception e) {
e.printStackTrace();
}
	}
}
