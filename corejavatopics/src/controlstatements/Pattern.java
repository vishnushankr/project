package controlstatements;

public class Pattern {

	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j += 2) {
				char c = (char) (65 + j);
				System.out.print(c);
			}
			System.out.println();
		}

	}
}