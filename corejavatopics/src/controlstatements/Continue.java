package controlstatements;

public class Continue {

	public static void main(String[] args) {
		int val = 3, ans = 0;
		for (int i = 1; i <= 5; i++) {
			if (i == val) {
				continue;

			}
			ans = ans + i;

		}
		System.out.println("sum=" + ans);
	}

}
