package io;

/*import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Buffereedexample {

	public static void main(String[] args) throws IOException {
BufferedReader vis= new BufferedReader(new FileReader("abc.txt"));

BufferedWriter sha=new BufferedWriter(new FileWriter("D:"+File.separator+"registre.txt"));
int i;
do {
	i=vis.read();
	if(i!=-1) {
		sha.write((char)i);
	}
}while(i!=-1);
vis.close();
sha.close();
BufferedReader obj=new BufferedReader(new FileReader("D:"+File.separator+"register.txt"));
do {
	i=obj.read();
	if(i!=-1) {
		System.out.println((char)i);
	}
}while(i!=-1);
	}

}*/
import java.io.*;
public class BufferedExample {
	
		  public static void main(String[] argv) throws IOException {
		    BufferedReader br = new BufferedReader(
		    		new FileReader("abc.txt"));
		    
		   
		   
		    
		    BufferedWriter bw = new BufferedWriter(
		    		new FileWriter("D:"+File.separator+"register1.txt"));
		    int i;
		   do{	    
		      i = br.read();  
		      if (i != -1) {
		       
		          bw.write((char) i);
		      }
		    } while (i != -1);
		    br.close();
		    bw.close();
		    
		    
		    BufferedReader br1 = new BufferedReader(new FileReader("D:"+File.separator+"register1.txt"));
		    do{	    
			      i = br1.read();
			      if (i != -1) {
			       
			         System.out.print((char) i);
			      }
			    } while (i != -1);
		  
		  br1.close();
		}}
