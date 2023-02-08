package string;

public class Split {

	public static void main(String[] args) {
		String s = "vishnu is doing ! multiplication";
		String ans[] = s.split("!");
		for (String val : ans) {
			System.out.println(val);

		}

	}

}
