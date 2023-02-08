package problems;

public class problemno2 {

	public static void main(String[] args) {
	/*	String str = "vishnu";
		char[] ch = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
		}
		for (char c : ch) {
			System.out.println(c);
		}*/

		String strOrig = "Hello World";
	    char[] stringArray;
	    
	    stringArray = strOrig.toCharArray(); 
	    
	    for(int index=0; index < stringArray.length; index++)
	      System.out.print(stringArray[index]);
	}
}
