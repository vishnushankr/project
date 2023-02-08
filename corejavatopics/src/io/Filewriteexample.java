package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filewriteexample {

	public static void main(String[] args) {
		/*
try {
	FileWriter f=new FileWriter("D:\\register.txt");
	f.write("hi this is vishnu");
	f.write("i am learning io");
	f.close();
	
	FileReader fr=new FileReader("D:\\tegister.txt");
	int ch;
	while((ch=fr.read())!=-1) {
		System.out.println((char)ch);
	}
	fr.close();
} catch (IOException e) {
	e.printStackTrace();
}

	}

}*/
		

	 	try {
	 		FileWriter f =new FileWriter("D:\\register.txt");
			f.write("This is my old file");
			f.write("We are learning about IO");
			f.close();
			
			FileReader fr =new FileReader("D:\\register.txt");
			
			int ch;
			while((ch=fr.read())!=-1){
				System.out.print((char)ch);
			}
			
			
			
			
			
			fr.close();
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	 

	 }}
