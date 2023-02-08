package arrays;

public class ArrayssAssignment {

	public static void main(String[] args) {
		int a[] = { 2, -3, 8, -5, -3, 6, 9 };
		int b[] = new int[a.length];
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				b[j] = a[i];
				j++;
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				b[j] = a[i];
				j++;
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

	}

}
