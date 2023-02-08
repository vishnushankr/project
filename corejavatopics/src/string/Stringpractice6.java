package string;

//replace(),replaceFirst(),replaceAll()....

public class Stringpractice6 {

	public static void main(String[] args) {
		
		String s="this is vishnu";
		
		//replace() it replaces all characters....
		System.out.println(s.replace("is", "was"));// thwas was vwashnu
		System.out.println(s.replace("sh","vi"));//this is vivinu
		
		//replaceFirst() it only replaces single character from first individually
        System.out.println(s.replaceFirst("is", "was"));//thwas is vishnu	
        System.out.println(s.replaceFirst("i","s"));//thss is vishnu
        
        //replaceALL() it replaces regular expressions
        System.out.println(s.replaceAll("is", "was"));//thwas was vwashnu
        System.out.println(s.replaceAll("is(.)", "was"));//thwasvwasnu
        System.out.println(s.replaceAll("is(.)*", "was"));//thwas

        
        
        
		

	}

}
