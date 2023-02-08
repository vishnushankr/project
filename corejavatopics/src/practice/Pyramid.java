package practice;

public class Pyramid {

	public static void main(String[] args) {
		/*
		 * int i,j; for(i=1;i<6;i++) { for(j=1;j<i;j++) { System.out.print(i+""); }
		 * System.out.println(); }
		 */

		for (char i = 65; i <= 75; i++) {
			char ch = 'A';
			for (char j = 65; j < i; j += 2) {

				System.out.print(j + "");
			}
			System.out.println();
		}
	}
}
