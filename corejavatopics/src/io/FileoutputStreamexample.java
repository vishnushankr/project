package io;
import java.io.*;
public class FileoutputStreamexample {

	public static void main(String[] args) {
		/*
try {
	FileOutputStream vis=new FileOutputStream("abc.txt");
	String s="hi this is vishnu";
	byte b[]=s.getBytes();
	vis.write(b);
	vis.close();
	
	
	FileInputStream sha =new FileInputStream("abc.txt");
	int val,i=0;
	while((val=sha.read())!=-1) {
		System.out.println((char)val);
	}
	vis.close();
	}catch(Exception e) {
		System.out.println(e);
	}

	}

}*/
		
		try{  
		     FileOutputStream fout=new FileOutputStream("abc.txt");  
		     String s="We are learning java";  
		     byte b[]=s.getBytes();//converting string into byte array  
		     fout.write(b);  
		     fout.close(); 
		     
		     
		     
		     FileInputStream fin=new FileInputStream("abc.txt");
		     int val,i=0;
		    
		     //read data till End of File
		     while((val=fin.read())!=-1){
		    	 	System.out.print((char)val);
		    	 	
		     }
		     fin.close();
		    
		    // System.out.println("success...");  
		    }catch(Exception e){System.out.println(e);}  
		  }  
		}  
