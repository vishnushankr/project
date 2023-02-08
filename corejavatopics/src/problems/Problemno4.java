package problems;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Problemno4 {

	public static void main(String[] args) {
		Date date = new Date(0);
		 
		 
		 DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		 
		
		 String strDate = dateFormat.format(date);
		 
		 System.out.println("Date converted to String: " + strDate);
	}

}
