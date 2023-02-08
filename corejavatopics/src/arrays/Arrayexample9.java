package arrays;

public class Arrayexample9 {

	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3 }, { 5, 6, 8 }, { 9, 10, 11 } };
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
