package io;

/*import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Trywithresource {

	public static void main(String[] args) {
try {
	FileOutputStream vis=new FileOutputStream("abc.txt");
	String s="vishnu shankar";
	byte byteArray[]=s.getBytes();
	vis.write(byteArray);
	System.out.println("it is correct");
	
	
	
	
}
catch(Exception e) {
	e.printStackTrace();
}
	}

}*/

import java.io.FileOutputStream;    
public class TryWithResources {    
public static void main(String args[]){      
        // Using try-with-resources  

	try(FileOutputStream fileOutputStream =new FileOutputStream("E:/abc.txt"))
	{     
		
	String msg = "Welcome to java world!";      
	byte byteArray[] = msg.getBytes(); //converting string into byte array      
	fileOutputStream.write(byteArray);  
	System.out.println("Message written to file successfuly!");   
	
}
	catch(Exception exception){  
       System.out.println(exception);  
}  
	
	
}      
} 
