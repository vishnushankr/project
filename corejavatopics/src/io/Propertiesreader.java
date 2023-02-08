package io;

import java.io.FileInputStream;
import java.util.Properties;

public class Propertiesreader {

	public static void main(String[] args) {
try {
	Properties 	vis= new Properties();
	FileInputStream obj3= new FileInputStream("db1.properties");
	vis.load(obj3);
	
	System.out.println(vis.getProperty("vishnu"));
	System.out.println(vis.getProperty("nidhi"));
	System.out.println(vis.getProperty("sirisha"));
}catch(Exception e) {
	e.printStackTrace();
}
	}

}
