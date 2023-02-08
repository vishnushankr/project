package arrays;

public class Arrayexample8 {

	public static void main(String[] args) {
		int a[][] = new int[2][3];
		for (int i = 0; i <= a.length; i++) {
			for (int j = 0; j <= a.length; j++)

			{

				System.out.print(a[i][j]);
			}
			System.out.println();
		}

	}
}