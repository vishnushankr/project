package io;

import java.io.FileOutputStream;
import java.util.Properties;

public class propertiesexample1 {

	public static void main(String[] args) {
try {
	Properties vis=new Properties();
	vis.setProperty("vishnu", "trainee");
	vis.setProperty("nidhi", "mentor");
	vis.setProperty("sirisha", "hr");
	FileOutputStream obj= new FileOutputStream("db1.properties");
	
vis.store(obj, null);
obj.close();
}catch(Exception e) {
	e.printStackTrace();
}

	}

}
