package controlstatements;

public class Breaklabel {

	public static void main(String[] args) {
		lable: for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.println(i + "" + j + " ");
				if (i == 2)
					break lable;
			}
		}
	}

}
