package arrays;

public class Arraysproblem3 {

	public static void main(String[] args) {
		int a[] = { 10, -2, -3, -5, 6, -7, 2, -12 };

		int neg = Arraysproblem3.negsum(a);
		System.out.println(neg);

	}

	public static int negsum(int a[]) {
		int x = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i] < 0) {
				x = x + a[i];

			}
		}
		return x;

	}

}
