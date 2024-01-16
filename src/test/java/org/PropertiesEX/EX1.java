package org.PropertiesEX;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class EX1 {

	public static void main(String[] args) {
	System.out.println("***Program Starts***");
	try {
		FileInputStream fis = new FileInputStream("./src/test/resource/Config.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		String browserName = prop.getProperty("bName");
		String URL = prop.getProperty("URL");
		String userName = prop.getProperty("uName");
		String password = prop.getProperty("pwd");
		
	
		System.out.println("Browser Name : " +browserName); 
		System.out.println("url : " +URL); 
		System.out.println("userName : " +userName);
		System.out.println("password : " +password); 
	}catch(IOException e) {
		e.printStackTrace();
		
	}
		System.out.println("***Program Ends***");
	}

}
